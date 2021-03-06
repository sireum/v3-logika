/*
 Copyright (c) 2016, Robby, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.sireum.logika.ast

import org.sireum.logika.tipe._
import org.sireum.util._
import org.sireum.util.Rewriter.HasInternalData

object Node {
  type Seq[T] = IVector[T]

  final def emptySeq[T]: Node.Seq[T] = ivectorEmpty[T]

  final def seq[T](es: T*): Node.Seq[T] = ivector(es: _*)

  final def seq[T](es: Iterable[T]): Node.Seq[T] = es.toVector

  final private[ast] def detectMode(unitNode: UnitNode): Unit = {
    var m = LogicMode.Propositional
    lazy val visitor = Visitor.build({
      case _: Apply | _: Quant[_] if m == LogicMode.Propositional =>
        m = LogicMode.Predicate
        true
    })
    unitNode match {
      case unitNode: TruthTable =>
        visitor(unitNode.formula)
        unitNode.mode = m
      case unitNode: Sequent =>
        unitNode.premises.foreach(visitor)
        unitNode.conclusions.foreach(visitor)
        unitNode.mode = m
      case unitNode: Program =>
        unitNode.mode = LogicMode.Programming
    }
  }

  implicit class At[T <: Node](n: Node)(
    implicit val nodeLocMap: MMap[Node, LocationInfo]) {
    def at(li: LocationInfo): T = {
      nodeLocMap(n) = li
      n.asInstanceOf[T]
    }

    def at(liBegin: LocationInfo, liEnd: LocationInfo): T = {
      nodeLocMap(n) = LocationInfo(
        lineBegin = liBegin.lineBegin,
        columnBegin = liBegin.columnBegin,
        offset = liBegin.offset,
        lineEnd = liEnd.lineEnd,
        columnEnd = liEnd.columnEnd,
        length = liEnd.offset + liEnd.length - liBegin.offset
      )
      n.asInstanceOf[T]
    }
  }

  final private[ast] def checkWellFormed(unitNode: UnitNode, isAutoEnabled: Boolean)
                                        (implicit reporter: AccumulatingTagReporter): Unit = {
    val nodeLocMap = unitNode.nodeLocMap.clone

    def error(n: Node, msg: String): Unit =
      reporter.report(nodeLocMap(n).toLocationError(
        unitNode.fileUriOpt, "Semantics", msg))

    unitNode match {
      case unitNode: TruthTable =>
        var vars = imapEmpty[String, Id]
        for (id <- unitNode.ids) {
          vars.get(id.value) match {
            case Some(prevId) =>
              val li = nodeLocMap(prevId)
              error(id, s"Identifier ${id.value} has been declared at [${li.lineBegin}, ${li.columnBegin}].")
            case _ => vars += (id.value -> id)
          }
        }
        Visitor.build({
          case id: Id =>
            vars.get(id.value) match {
              case None =>
                error(id, s"Undefined identifier ${id.value}.")
              case _ =>
            }
            true
          case _: And | _: Or | _: Implies | _: Not => true
          case n: Node =>
            error(n, s"Truth Table mode only allows identifier, and, or, implication, and negation expressions.")
            true
        })(unitNode.formula)
        val star = nodeLocMap(unitNode.star).columnBegin
        val formula = nodeLocMap(unitNode.formula).columnBegin
        var seenAssignments = imapEmpty[IVector[Boolean], TruthTableRow]
        for (row <- unitNode.rows) {
          val assignments = row.assignments.value.map(_.value)
          seenAssignments.get(assignments) match {
            case Some(otherRow) =>
              val li = nodeLocMap(otherRow)
              error(row, s"Duplicate assignments to the ones in [${li.lineBegin}, ${li.columnBegin}]")
            case _ =>
          }
          if (row.assignments.value.size != unitNode.ids.size) {
            error(row, s"Invalid number of variable assignments (expecting ${unitNode.ids.size} instead of ${row.assignments.value.size}). ")
          }
          seenAssignments += assignments -> row
        }
        if (star != formula) {
          error(unitNode.star, "Invalid location for * (it should be in the same column as the top-level formula expression).")
        }
        unitNode.statusOpt match {
          case Some(status: ContingentStatus) =>
            var seen = imapEmpty[IVector[Boolean], Assignments]
            for (a <- status.trueAssignments ++ status.falseAssignments) {
              val assignments = a.value.map(_.value)
              seen.get(assignments) match {
                case Some(other) =>
                  val li = nodeLocMap(other)
                  error(a, s"Duplicate assignments to the ones in [${li.lineBegin}, ${li.columnBegin}]")
                case _ => seen += assignments -> a
              }
            }
          case _ =>
        }
        return
      case unitNode: Sequent => checkWellFormedSequent(unitNode)
      case _ =>
    }
    val isPredicate = unitNode.mode == LogicMode.Predicate
    val isProgram = unitNode.mode == LogicMode.Programming
    var applyMap = imapEmpty[String, Apply]
    lazy val v: Any => Boolean = Visitor.build({
      case n: Quant[_] =>
        if (isPredicate)
          n.domainOpt match {
            case Some(d) =>
              error(d, s"Predicate logic mode disallows explicit type specification in quantifications.")
            case _ =>
          }
        else if (isProgram && n.domainOpt.isEmpty)
          error(n, s"Program logic mode requires explicit type specification in quantifications.")
        true
      case n: QuantAssumeStep =>
        if (isPredicate)
          n.typeOpt match {
            case Some(t) =>
              error(t, s"Predicate logic mode disallows explicit type specification in quantifications.")
            case _ =>
          }
        else if (isProgram && n.typeOpt.isEmpty)
          error(n, s"Program logic mode requires explicit type specification in quantifications.")
        true
      case n@Id(id) if !isProgram =>
        applyMap.get(id) match {
          case Some(a) =>
            if (a.args.nonEmpty) {
              val aLi = nodeLocMap(a)
              error(n, s"Identifier $id is used as a variable here but it was at [${aLi.lineBegin}, ${aLi.columnBegin}] as an uninterpreted function.")
            }
          case _ =>
            val a = Apply(n, Node.emptySeq)
            nodeLocMap.put(a, nodeLocMap(n))
            applyMap += (id -> a)
        }
        false
      case a@Apply(Id(id), args) if !isProgram =>
        applyMap.get(id) match {
          case Some(a2) =>
            if (a2.args.size != a.args.size) {
              val a2Li = nodeLocMap(a2)
              error(a, s"The number of arguments for $id differs from the one at [${a2Li.lineBegin}, ${a2Li.columnBegin}].")
            }
          case _ => applyMap += (id -> a)
        }
        for (arg <- args) v(arg)
        false
      case w: While =>
        for (s <- w.block.stmts) s match {
          case _: MethodDecl =>
            error(s, s"Methods cannot be defined inside a while-block.")
          case _ =>
        }
        true
      case i: If =>
        for (s <- i.trueBlock.stmts ++ i.falseBlock.stmts) s match {
          case _: MethodDecl =>
            error(s, s"Methods cannot be defined inside an if-block.")
          case _ =>
        }
        true
      case m: MethodDecl =>
        for (s <- m.block.stmts) {
          s match {
            case _: MethodDecl =>
              error(s, s"Methods cannot be defined inside another method.")
            case _ =>
          }
          Visitor.build({
            case _: FactStmt =>
              error(s, s"Facts cannot be defined inside a method.")
              false
            case _: InvStmt =>
              error(s, s"Invariants cannot be defined inside a method.")
              false
            case _: Invariant =>
              error(s, s"Invariant justification cannot be used inside a method.")
              false
          })(s)
        }
        true
      case n: Auto =>
        if (!isAutoEnabled) error(n, s"Auto is not enabled, but auto summoning is used.")
        true
      case n: SequentStmt =>
        if (!isAutoEnabled) error(n, s"Auto is not enabled, but sequent is used.")
        true
    })
    v(unitNode)
  }

  final private[ast]
  def checkWellFormedSequent(unitNode: Sequent)
                            (implicit reporter: AccumulatingTagReporter): Unit = {
    val nodeLocMap = unitNode.nodeLocMap
    var freeIds = imapEmpty[String, Id]
    var hasErrors = false

    def error(n: Node, msg: String): Unit = {
      hasErrors = true
      reporter.report(nodeLocMap(n).toLocationError(unitNode.fileUriOpt, "Semantics", msg))
    }

    def collectFreeIds(node: Node, declIds: IMap[String, Id]): Unit = {
      Visitor.build({
        case node: Quant[_] =>
          for (id <- node.ids)
            declIds.get(id.value) match {
              case Some(otherId) =>
                val li = nodeLocMap(otherId)
                error(id, s"Identifier ${id.value} has been declared at [${li.lineBegin}, ${li.columnBegin}].")
              case _ =>
            }
          collectFreeIds(node.exp, declIds ++ node.ids.map(id => id.value -> id))
          false
        case node: Id =>
          val nodeValue = node.value
          if (!declIds.contains(nodeValue) && !freeIds.contains(nodeValue))
            freeIds += nodeValue -> node
          false
      })(node)
    }

    unitNode.premises.foreach(collectFreeIds(_, imapEmpty))
    unitNode.conclusions.foreach(collectFreeIds(_, imapEmpty))
    if (hasErrors) return
    var currentIds = freeIds.keySet
    freeIds = imapEmpty[String, Id]
    collectFreeIds(unitNode, imapEmpty)
    lazy val v: Any => Boolean = Visitor.build({
      case n: Auto =>
        error(n, s"Auto is only available in programming logic.")
        true
      case n: BType =>
        error(n, s"Boolean type is only available in programming logic.")
        true
      case n: IntegralType =>
        error(n, s"Integral type is only available in programming logic.")
        true
      case n: SeqType =>
        error(n, s"Sequence type is only available in programming logic.")
        true
      case n: IntLit =>
        error(n, s"Integral literal is only available in programming logic.")
        true
      case n: IntMin =>
        error(n, s"Integer minimum is only available in programming logic.")
        true
      case n: IntMax =>
        error(n, s"Integer maximum is only available in programming logic.")
        true
      case n: SeqLit =>
        error(n, s"Sequence literal is only available in programming logic.")
        true
      case n: Mul =>
        error(n, s"Multiplication is only available in programming logic.")
        true
      case n: Div =>
        error(n, s"Division is only available in programming logic.")
        true
      case n: Rem =>
        error(n, s"Remainder is only available in programming logic.")
        true
      case n: Add =>
        error(n, s"Addition is only available in programming logic.")
        true
      case n: Sub =>
        error(n, s"Substraction is only available in programming logic.")
        true
      case n: Lt =>
        error(n, s"Less-than comparison is only available in programming logic.")
        true
      case n: Le =>
        error(n, s"Less-than-or-equal comparison is only available in programming logic.")
        true
      case n: Gt =>
        error(n, s"Greater-than comparison is only available in programming logic.")
        true
      case n: Ge =>
        error(n, s"Greater-than-or-equal comparison is only available in programming logic.")
        true
      case n: Eq =>
        error(n, s"Equal comparison is only available in programming logic.")
        true
      case n: Ne =>
        error(n, s"Non-equal comparison is only available in programming logic.")
        true
      case n: Shl =>
        error(n, s"Shift-left operator is only available in programming logic.")
        true
      case n: Shr =>
        error(n, s"Shift-right operator is only available in programming logic.")
        true
      case n: UShr =>
        error(n, s"Unsigned shift-right operator is only available in programming logic.")
        true
      case n: Append =>
        error(n, s"Sequence append operator is only available in programming logic.")
        true
      case n: Prepend =>
        error(n, s"Sequence prepend operator is only available in programming logic.")
        true
      case n: Xor =>
        error(n, s"Xor operator is only available in programming logic.")
        true
      case n: Minus =>
        error(n, s"Negative operator is only available in programming logic.")
        true
      case n: Apply if unitNode.mode == LogicMode.Propositional =>
        error(n, s"Function application is not available in propositional logic.")
        true
      case n: QuantAssumeStep =>
        freeIds.get(n.id.value) match {
          case Some(id) if n.id ne id =>
            val li = nodeLocMap(id)
            error(n, s"The variable ${id.value} in step #${n.num.value}, is not fresh as it has been used at [${li.lineBegin}, ${li.columnBegin}].")
          case _ =>
        }
        true
      case n: SubProof =>
        val oldIds = currentIds
        n.assumeStep match {
          case step: ForAllAssumeStep =>
            currentIds += step.id.value
          case step: ExistsAssumeStep =>
            currentIds += step.id.value
          case _ =>
        }
        n.allSteps.foreach(v)
        currentIds = oldIds
        false
      case n: ForAllElim =>
        val v2 = Visitor.build({
          case id@Id(value) if !currentIds.contains(value) =>
            error(id, s"Undeclared identifier $value.")
            false
        })
        n.args.foreach(v2)
        true
      case n: Quant[_] =>
        if (unitNode.mode == LogicMode.Propositional)
          error(n, s"Quantification is not available in propositional logic.")
        for (id <- n.ids)
          freeIds.get(id.value) match {
            case Some(otherId) =>
              val li = nodeLocMap(otherId)
              error(id, s"Identifier ${id.value} has been used as a free variable at [${li.lineBegin}, ${li.columnBegin}].")
            case _ =>
          }
        true
    })
    v(unitNode)
  }
}

object LogicMode {
  private var counter = 0
  final val Propositional = LogicMode("Propositional")
  final val Predicate = LogicMode("Predicate")
  final val Programming = LogicMode("Program")
  val valueOf: ILinkedMap[String, LogicMode] = ilinkedMap(
    Propositional.value -> Propositional,
    Predicate.value -> Predicate,
    Programming.value -> Programming
  )

  def valueOf(index: Int): LogicMode =
    valueOf.values.toSeq(index)
}

final case class LogicMode private(value: String) {
  val ordinal: Natural = {
    val o = LogicMode.counter
    LogicMode.counter += 1
    o
  }

  override def toString: String = value
}

sealed trait Node extends Product {
//  override def hashCode(): Int = System.identityHashCode(this)
//
//  override def equals(obj: Any): Boolean = this.hashCode() == obj.hashCode()
}

sealed trait UnitNode extends Node {
  var fileUriOpt: Option[FileResourceUri] = None
  var nodeLocMap: MIdMap[Node, LocationInfo] = midmapEmpty
  var mode = LogicMode.Programming
  var input: String = ""

}

final case class TruthTable(star: TruthTableMarker,
                            ids: Node.Seq[Id],
                            bar: TruthTableMarker,
                            formula: Exp,
                            rows: Node.Seq[TruthTableRow],
                            statusOpt: Option[TruthTableStatus])
  extends UnitNode

final case class TruthTableMarker() extends Node {

}

final case class TruthTableRow(assignments: Assignments,
                               bar: TruthTableMarker,
                               values: Node.Seq[BooleanLit])
  extends Node

final case class Assignments(value: Node.Seq[BooleanLit]) extends Node

sealed trait TruthTableStatus extends Node

final case class TautologyStatus() extends TruthTableStatus

final case class ContradictoryStatus() extends TruthTableStatus

final case class ContingentStatus(trueAssignments: Node.Seq[Assignments],
                                  falseAssignments: Node.Seq[Assignments])
  extends TruthTableStatus

final case class Sequent(premises: Node.Seq[Exp],
                         conclusions: Node.Seq[Exp],
                         proofOpt: Option[Proof])
  extends UnitNode {
  private val eqs = (premises.toSet, conclusions.toSet)
  override val hashCode: Int = eqs.hashCode

  Node.detectMode(this)
}

sealed trait ProofStep extends Node {
  def num: Num
}

final case class Num(value: Natural) extends Node

sealed trait ProofGroup extends Node {
  def steps: Node.Seq[ProofStep]

  def allSteps: Node.Seq[ProofStep]

  def first: ProofStep

  def last: ProofStep
}

final case class Proof(steps: Node.Seq[ProofStep])
  extends ProofGroup {
  override def allSteps: Node.Seq[ProofStep] = steps

  override def first: ProofStep = steps.head

  override def last: ProofStep = steps.last
}

sealed trait RegularStep extends ProofStep {
  def exp: Exp
}

final case class Premise(num: Num,
                         exp: Exp) extends RegularStep

final case class AndIntro(num: Num,
                          exp: And,
                          leftStep: Num,
                          rightStep: Num) extends RegularStep

final case class AndElim1(num: Num,
                          exp: Exp,
                          andStep: Num) extends RegularStep

final case class AndElim2(num: Num,
                          exp: Exp,
                          andStep: Num) extends RegularStep

final case class OrIntro1(num: Num,
                          exp: Or,
                          step: Num) extends RegularStep

final case class OrIntro2(num: Num,
                          exp: Or,
                          step: Num) extends RegularStep

final case class OrElim(num: Num,
                        exp: Exp,
                        orStep: Num,
                        leftSubProof: Num,
                        rightSubProof: Num) extends RegularStep

final case class ImpliesIntro(num: Num,
                              exp: Implies,
                              subProof: Num)
  extends RegularStep

final case class ImpliesElim(num: Num,
                             exp: Exp,
                             impliesStep: Num,
                             antecedentStep: Num)
  extends RegularStep

final case class NegIntro(num: Num,
                          exp: Not,
                          subProof: Num) extends RegularStep

final case class NegElim(num: Num,
                         exp: Exp,
                         step: Num,
                         negStep: Num) extends RegularStep

final case class BottomElim(num: Num,
                            exp: Exp,
                            falseStep: Num) extends RegularStep

final case class Pbc(num: Num,
                     exp: Exp,
                     subProof: Num) extends RegularStep

final case class Subst1(num: Num,
                        exp: Exp,
                        eqStep: Num,
                        step: Num) extends RegularStep

final case class Subst2(num: Num,
                        exp: Exp,
                        eqStep: Num,
                        step: Num) extends RegularStep

final case class Algebra(num: Num,
                         exp: Exp,
                         nums: Node.Seq[Num])
  extends RegularStep

final case class ForAllIntro(num: Num,
                             exp: ForAll,
                             subProof: Num)
  extends RegularStep

final case class ForAllElim(num: Num,
                            exp: Exp,
                            step: Num,
                            args: Node.Seq[Exp])
  extends RegularStep

final case class ExistsIntro(num: Num,
                             exp: Exists,
                             step: Num,
                             args: Node.Seq[Exp])
  extends RegularStep

final case class ExistsElim(num: Num,
                            exp: Exp,
                            step: Num,
                            subProof: Num) extends RegularStep

final case class Invariant(num: Num,
                           exp: Exp)
  extends RegularStep

final case class FactJust(num: Num,
                          exp: Exp,
                          id: Id)
  extends RegularStep {

  var decl: Either3[Fact, (Fun, FunDef), MethodDecl] = _
}

final case class Auto(num: Num,
                      exp: Exp,
                      steps: Node.Seq[Num])
  extends RegularStep

final case class SubProof(num: Num, // number of the subproof
                          assumeStep: AssumeStep, // the assume step at the beginning of the subproof
                          steps: Node.Seq[ProofStep]) // the rest of the steps of the subproof
  extends ProofStep with ProofGroup {

  override def allSteps: Node.Seq[ProofStep] = assumeStep +: steps // all steps consist of assume step and rest of steps

  override def first: AssumeStep = assumeStep // the first step is the assume step

  override def last: ProofStep =
    if (steps.isEmpty) assumeStep else steps.last
}

sealed trait AssumeStep extends ProofStep

final case class PlainAssumeStep(num: Num,
                                 exp: Exp)
  extends AssumeStep with RegularStep

sealed trait QuantAssumeStep extends AssumeStep {
  def id: Id

  def typeOpt: Option[Type]
}

final case class ForAllAssumeStep(num: Num,
                                  id: Id,
                                  typeOpt: Option[Type])
  extends QuantAssumeStep

final case class ExistsAssumeStep(num: Num,
                                  id: Id,
                                  typeOpt: Option[Type],
                                  exp: Exp)
  extends QuantAssumeStep with RegularStep

object Exp {
  def Id(tipe: Tipe, name: String): Id = {
    val r = org.sireum.logika.ast.Id(name)
    r.tipe = tipe
    r
  }

  def Size(tipe: Tipe, exp: Exp): Size = {
    val r = org.sireum.logika.ast.Size(exp)
    r.tipe = tipe
    r
  }

  def Apply(expTipe: Tipe, exp: Exp, args: Node.Seq[Exp]): Apply = {
    val r = org.sireum.logika.ast.Apply(exp, args)
    r.expTipe = expTipe
    r
  }

  def And(tipe: Tipe, left: Exp, right: Exp): And = {
    val r = org.sireum.logika.ast.And(left, right)
    r.tipe = tipe
    r
  }

  def And(args: Node.Seq[Exp]): Exp =
    if (args.isEmpty) BooleanLit(value = true)
    else {
      var r = args.head
      for (arg <- args.tail) {
        r = And(B, r, arg)
      }
      r
    }

  def Or(tipe: Tipe, left: Exp, right: Exp): Or = {
    val r = org.sireum.logika.ast.Or(left, right)
    r.tipe = tipe
    r
  }

  def Or(args: Node.Seq[Exp]): Exp =
    if (args.isEmpty) BooleanLit(value = false)
    else {
      var r = args.head
      for (arg <- args.tail) {
        r = Or(B, r, arg)
      }
      r
    }

  def Implies(tipe: Tipe, left: Exp, right: Exp): Implies = {
    val r = org.sireum.logika.ast.Implies(left, right)
    r.tipe = tipe
    r
  }

  def Implies(args: Node.Seq[Exp]): Exp =
    if (args.isEmpty) BooleanLit(value = false)
    else {
      var i = args.size - 1
      var r = args(i)
      i -= 1
      while (i >= 0) {
        r = Implies(B, args(i), r)
        i -= 1
      }
      r
    }

  def Eq(tipe: Tipe, left: Exp, right: Exp): Eq = {
    val r = org.sireum.logika.ast.Eq(left, right)
    r.tipe = tipe
    r
  }

  def Ne(tipe: Tipe, left: Exp, right: Exp): Ne = {
    val r = org.sireum.logika.ast.Ne(left, right)
    r.tipe = tipe
    r
  }

  def Lt(tipe: Tipe, left: Exp, right: Exp): Lt = {
    val r = org.sireum.logika.ast.Lt(left, right)
    r.tipe = tipe
    r
  }

  def Le(tipe: Tipe, left: Exp, right: Exp): Le = {
    val r = org.sireum.logika.ast.Le(left, right)
    r.tipe = tipe
    r
  }

  def Gt(tipe: Tipe, left: Exp, right: Exp): Gt = {
    val r = org.sireum.logika.ast.Gt(left, right)
    r.tipe = tipe
    r
  }

  def Ge(tipe: Tipe, left: Exp, right: Exp): Ge = {
    val r = org.sireum.logika.ast.Ge(left, right)
    r.tipe = tipe
    r
  }

  def Not(tipe: Tipe, exp: Exp): Not = {
    val r = org.sireum.logika.ast.Not(exp)
    r.tipe = tipe
    r
  }

  def RangeDomain(tipe: Tipe, lo: Exp, hi: Exp, loLt: Boolean, hiLt: Boolean): RangeDomain = {
    val r = org.sireum.logika.ast.RangeDomain(lo, hi, loLt, hiLt)
    r.tipe = tipe
    r
  }

  final def toString(e: Exp, inProof: Boolean): String = {
    val sb = new StringBuilder
    e.buildString(sb, inProof)
    sb.toString
  }
}

sealed trait StringOrExp extends Node

final case class StringLit(value: String) extends StringOrExp

sealed trait Exp extends StringOrExp {
  private[ast] var hasParen = false

  private[ast] def buildString(sb: StringBuilder, inProof: Boolean): Unit

  def precedence: Int

  def isResolved: Boolean
}

sealed trait PrimaryExp extends Exp {
  final override def precedence: Int = 0
}

final case class BooleanLit(value: Boolean) extends PrimaryExp {
  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit =
    sb.append(if (value) "T" else "F")
}

final case class Id(value: String) extends PrimaryExp with HasInternalData[Id] {
  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null

  override def copy(other: Id): Unit = {
    tipe = other.tipe
  }

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit =
    sb.append(value)
}

final case class Size(exp: Exp) extends PrimaryExp with HasInternalData[Size] {
  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null && exp.isResolved

  override def copy(other: Size): Unit = {
    tipe = other.tipe
  }

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    exp.buildString(sb, inProof)
    sb.append(".size")
  }
}

final case class Clone(id: Id) extends PrimaryExp {
  override val isResolved: Boolean = id.isResolved

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    id.buildString(sb, inProof)
    sb.append(".clone")
  }
}

final case class Result() extends PrimaryExp with HasInternalData[Result] {
  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null

  override def copy(other: Result): Unit = {
    tipe = other.tipe
  }

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    sb.append("result")
  }
}

final case class Apply(exp: Exp,
                       args: Node.Seq[Exp]) extends PrimaryExp with HasInternalData[Apply] {
  var expTipe: Tipe = _

  var declOpt: Option[Either[MethodDecl, Fun]] = None

  override def isResolved: Boolean = expTipe != null && exp.isResolved &&
    args.forall(_.isResolved)

  override def copy(other: Apply): Unit = {
    expTipe = other.expTipe
    declOpt = other.declOpt
  }

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    exp.buildString(sb, inProof)
    sb.append('(')
    if (args.nonEmpty) {
      args.head.buildString(sb, inProof)
      for (arg <- args.tail) {
        sb.append(", ")
        arg.buildString(sb, inProof)
      }
    }
    sb.append(')')
  }
}

final case class RandomInt() extends PrimaryExp {
  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    sb.append("randomInt()")
  }
}

final case class ReadInt(msgOpt: Option[StringLit])
  extends PrimaryExp {
  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    sb.append("readInt()")
  }
}

final case class IntLit(value: String,
                        bitWidth: Int,
                        tpeOpt: Option[IntegralType]) extends PrimaryExp {
  lazy val normalize: BigInt = {
    tpeOpt match {
      case None => BigInt(value)
      case Some(tpe) =>
        var n = if (value.startsWith("0x")) BigInt(value.substring(2), 16) else BigInt(value)
        tpe match {
          case _: ZType =>
            if (bitWidth != 0 && !(BigInt(-2).pow(bitWidth - 1) <= n && n <= BigInt(2).pow(bitWidth - 1) - 1))
              throw new IllegalStateException(s"Literal $value is outside of $bitWidth-bit Z's value range.")
            n
          case _: Z8Type =>
            if (!(BigInt(Byte.MinValue) <= n && n <= BigInt(Byte.MaxValue)))
              throw new IllegalStateException(s"Literal $value is outside of Z8's value range.")
            n
          case _: Z16Type =>
            if (!(BigInt(Short.MinValue) <= n && n <= BigInt(Short.MaxValue)))
              throw new IllegalStateException(s"Literal $value is outside of Z16's value range.")
            n
          case _: Z32Type =>
            if (!(BigInt(Int.MinValue) <= n && n <= BigInt(Int.MaxValue)))
              throw new IllegalStateException(s"Literal $value is outside of Z32's value range.")
            n
          case _: Z64Type =>
            if (!(BigInt(Long.MinValue) <= n && n <= BigInt(Long.MaxValue)))
              throw new IllegalStateException(s"Literal $value is outside of Z64's value range.")
            n
          case _: NType =>
            if (n < 0)
              throw new IllegalStateException(s"Literal $value is outside of N's value range.")
            n
          case _: N8Type =>
            if (!(BigInt(0) <= n && n <= BigInt(255)))
              throw new IllegalStateException(s"Literal $value is outside of N8's value range.")
            n
          case _: N16Type =>
            if (!(BigInt(0) <= n && n <= BigInt(65535)))
              throw new IllegalStateException(s"Literal $value is outside of N16's value range.")
            n
          case _: N32Type =>
            if (!(BigInt(0) <= n && n <= BigInt(4294967295L)))
              throw new IllegalStateException(s"Literal $value is outside of N32's value range.")
            n
          case _: N64Type =>
            if (!(BigInt(0) <= n && n <= BigInt("18446744073709551615")))
              throw new IllegalStateException(s"Literal $value is outside of N64's value range.")
            n
          case _: S8Type => BigInt(n.toByte)
          case _: S16Type => BigInt(n.toShort)
          case _: S32Type => BigInt(n.toInt)
          case _: S64Type => BigInt(n.toLong)
          case _: U8Type =>
            n = BigInt(n.toByte)
            if (n < 0) BigInt(Byte.MaxValue) + 1 - (BigInt(Byte.MinValue) - n) else n
          case _: U16Type =>
            n = BigInt(n.toShort)
            if (n < 0) BigInt(Short.MaxValue) + 1 - (BigInt(Short.MinValue) - n) else n
          case _: U32Type =>
            n = BigInt(n.toInt)
            if (n < 0) BigInt(Int.MaxValue) + 1 - (BigInt(Int.MinValue) - n) else n
          case _: U64Type =>
            n = BigInt(n.toLong)
            if (n < 0) BigInt(Long.MaxValue) + 1 - (BigInt(Long.MinValue) - n) else n
        }
    }
  }

  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = tpeOpt match {
    case None => sb.append(value)
    case Some(t) =>
      t match {
        case _: ZType => sb.append('z')
        case _: Z8Type => sb.append("z8")
        case _: Z16Type => sb.append("z16")
        case _: Z32Type => sb.append("z32")
        case _: Z64Type => sb.append("z64")
        case _: NType => sb.append('n')
        case _: N8Type => sb.append("n8")
        case _: N16Type => sb.append("n16")
        case _: N32Type => sb.append("n32")
        case _: N64Type => sb.append("n64")
        case _: S8Type => sb.append("s8")
        case _: S16Type => sb.append("s16")
        case _: S32Type => sb.append("s32")
        case _: S64Type => sb.append("s64")
        case _: U8Type => sb.append("u8")
        case _: U16Type => sb.append("u16")
        case _: U32Type => sb.append("u32")
        case _: U64Type => sb.append("u64")
      }
      sb.append('"')
      sb.append(value)
      sb.append('"')
  }
}

final case class FloatLit(value: String) extends PrimaryExp {
  val primitiveValue: Either[Float, Double] =
    if (value.charAt(value.length - 1).toUpper == 'F') Left(value.toFloat)
    else Right(value.toDouble)

  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit =
    sb.append(value)
}

final case class RealLit(value: String) extends PrimaryExp {
  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit =
    sb.append(value)
}

final case class IntMin(bitWidth: Int,
                        integralType: IntegralType) extends PrimaryExp {
  val value: BigInt =
    integralType match {
      case _: ZType if bitWidth == 0 => BigInt(0)
      case _: ZType | _: Z8Type | _: Z16Type | _: Z32Type | _: Z64Type |
           _: S8Type | _: S16Type | _: S32Type | _: S64Type =>
        BigInt(-2).pow(bitWidth - 1)
      case _: NType | _: N8Type | _: N16Type | _: N32Type | _: N64Type |
           _: U8Type | _: U16Type | _: U32Type | _: U64Type =>
        BigInt(0)
    }

  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    integralType.buildString(sb)
    sb.append(".Min")
  }
}

final case class IntMax(bitWidth: Int,
                        integralType: IntegralType) extends PrimaryExp {
  val value: BigInt =
    integralType match {
      case _: ZType if bitWidth == 0 => BigInt(0)
      case _: ZType | _: Z8Type | _: Z16Type | _: Z32Type | _: Z64Type |
           _: S8Type | _: S16Type | _: S32Type | _: S64Type =>
        BigInt(2).pow(bitWidth - 1) - 1
      case _: NType | _: N8Type | _: N16Type | _: N32Type | _: N64Type |
           _: U8Type | _: U16Type | _: U32Type | _: U64Type =>
        BigInt(2).pow(bitWidth) - 1
    }

  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    integralType.buildString(sb)
    sb.append(".Max")
  }
}

final case class Random(tpe: Type) extends PrimaryExp {
  override def isResolved: Boolean = true

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    tpe.buildString(sb)
    sb.append(".random")
  }
}

final case class TypeMethodCallExp(tpe: Type, id: Id, args: Node.Seq[Exp]) extends PrimaryExp {
  override def isResolved: Boolean = id.isResolved && args.forall(_.isResolved)

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    tpe.buildString(sb)
    sb.append('.')
    sb.append(id.value)
    sb.append('(')
    if (args.nonEmpty) {
      args.head.buildString(sb, inProof)
      for (arg <- args.tail) {
        sb.append(", ")
        arg.buildString(sb, inProof)
      }
    }
    sb.append(')')
  }
}

sealed trait BinaryExp extends Exp with HasInternalData[BinaryExp] {
  def left: Exp

  def op(inProof: Boolean): String

  def right: Exp

  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null && left.isResolved && right.isResolved

  final override def copy(other: BinaryExp): Unit = {
    tipe = other.tipe
  }

  final override def buildString(sb: StringBuilder,
                                 inProof: Boolean): Unit = {
    if (left.precedence > precedence ||
      (isInstanceOf[Implies] && left.precedence == precedence)) {
      sb.append('(')
      left.buildString(sb, inProof)
      sb.append(')')
    } else {
      left.buildString(sb, inProof)
    }
    sb.append(' ')
    sb.append(op(inProof))
    sb.append(' ')
    if (right.precedence > precedence ||
      (!isInstanceOf[Implies] && right.precedence == precedence)) {
      sb.append('(')
      right.buildString(sb, inProof)
      sb.append(')')
    } else {
      right.buildString(sb, inProof)
    }
  }
}

sealed trait MultiplicativeExp extends BinaryExp {
  final override val precedence = 10
}

final case class Mul(left: Exp, right: Exp) extends MultiplicativeExp {
  override def op(inProof: Boolean): String = "*"
}

final case class Div(left: Exp, right: Exp) extends MultiplicativeExp {
  override def op(inProof: Boolean): String = "/"
}

final case class Rem(left: Exp, right: Exp) extends MultiplicativeExp {
  override def op(inProof: Boolean): String = "%"
}

sealed trait AdditiveExp extends BinaryExp {
  final override val precedence = 20
}

final case class Add(left: Exp, right: Exp) extends AdditiveExp {
  override def op(inProof: Boolean): String = "+"
}

final case class Sub(left: Exp, right: Exp) extends AdditiveExp {
  override def op(inProof: Boolean): String = "-"
}

sealed trait InequalityExp extends BinaryExp {
  final override val precedence = 50
}

final case class Lt(left: Exp, right: Exp) extends InequalityExp {
  override def op(inProof: Boolean): String = "<"
}

final case class Le(left: Exp, right: Exp) extends InequalityExp {
  override def op(inProof: Boolean): String = if (inProof) "≤" else "<="
}

final case class Gt(left: Exp, right: Exp) extends InequalityExp {
  override def op(inProof: Boolean): String = ">"
}

final case class Ge(left: Exp, right: Exp) extends InequalityExp {
  override def op(inProof: Boolean): String = if (inProof) "≥" else ">="
}

sealed trait ShiftExp extends BinaryExp {
  final override val precedence = 50
}

final case class Shr(left: Exp, right: Exp) extends ShiftExp {
  override def op(inProof: Boolean): String = ">>"
}

final case class UShr(left: Exp, right: Exp) extends ShiftExp {
  override def op(inProof: Boolean): String = ">>>"
}

final case class Shl(left: Exp, right: Exp) extends ShiftExp {
  override def op(inProof: Boolean): String = "<<"
}

sealed trait EqualityExp extends BinaryExp {
  final override val precedence = 40
}

final case class Eq(left: Exp, right: Exp) extends EqualityExp {
  override def op(inProof: Boolean): String = if (inProof) "=" else "=="
}

final case class Ne(left: Exp, right: Exp) extends EqualityExp {
  override def op(inProof: Boolean): String = if (inProof) "≠" else "!="
}

final case class Append(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String = ":+"

  override val precedence = 40
}

final case class Prepend(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String = "+:"

  override val precedence = 30
}

final case class And(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String =
    if (inProof)
      tipe match {
        case _: IntegralTipe => "&"
        case _ => "∧"
      }
    else "&"

  override val precedence = 60
}

final case class Xor(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String =
    if (inProof)
      tipe match {
        case _: IntegralTipe => "^|"
        case _ => "xor"
      }
    else "^|"

  override val precedence = 70
}

final case class Or(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String =
    if (inProof)
      tipe match {
        case _: IntegralTipe => "|"
        case _ => "∨"
      }
    else "|"

  override val precedence = 80
}

final case class Implies(left: Exp, right: Exp) extends BinaryExp {
  override def op(inProof: Boolean): String = if (inProof) "→" else "->"

  override val precedence = 90
}

sealed trait UnaryExp extends Exp with HasInternalData[UnaryExp] {
  def op(inProof: Boolean): String

  def exp: Exp

  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null && exp.isResolved

  final override def copy(other: UnaryExp): Unit = {
    tipe = other.tipe
  }

  final override def buildString(sb: StringBuilder,
                                 inProof: Boolean): Unit = {
    sb.append(op(inProof))
    if (exp match {
      case _: PrimaryExp => false
      case exp: UnaryExp => exp.precedence > precedence
      case _ => true
    }) {
      sb.append('(')
      exp.buildString(sb, inProof)
      sb.append(')')
    } else exp.buildString(sb, inProof)
  }
}

final case class Not(exp: Exp) extends UnaryExp {
  override def op(inProof: Boolean): String = if (inProof) "¬" else "!"

  override def precedence: Int = 40
}

final case class Minus(exp: Exp) extends UnaryExp {
  override def op(inProof: Boolean): String = "-"

  override def precedence: Int = 20
}

sealed trait Quant[T <: Quant[T]] extends Exp {
  def op: String

  def ids: Node.Seq[Id]

  def domainOpt: Option[QuantDomain]

  def exp: Exp

  override def precedence = 100

  override def isResolved: Boolean = ids.forall(_.isResolved) &&
    domainOpt.forall(_.isResolved) && exp.isResolved

  override final def buildString(sb: StringBuilder,
                                 inProof: Boolean): Unit = {
    sb.append(op)
    sb.append(' ')
    ids.head.buildString(sb, inProof)
    for (id <- ids.tail) {
      sb.append(", ")
      id.buildString(sb, inProof)
    }
    domainOpt match {
      case Some(t: TypeDomain) =>
        sb.append(": ")
        t.tpe.buildString(sb)
        sb.append("  ")
      case Some(r: RangeDomain) =>
        sb.append(": (")
        r.lo.buildString(sb, inProof)
        sb.append(' ')
        if (r.loLt) sb.append('<')
        sb.append("..")
        if (r.hiLt) sb.append('<')
        sb.append(' ')
        r.hi.buildString(sb, inProof)
        sb.append(")  ")
      case None =>
        sb.append("  ")
    }
    exp.buildString(sb, inProof)
  }

  private var simplified: T = _

  final def simplify: T = {
    if (simplified != null) return simplified
    simplified =
      domainOpt match {
        case Some(RangeDomain(lo, hi, loLt, hiLt)) =>
          val isForAll = isInstanceOf[ForAll]

          def range(id: Id, l: Exp, h: Exp): And = {
            val lApply = if (loLt) Lt else Le
            val rApply = if (hiLt) Lt else Le
            And(lApply(l, id), rApply(id, h))
          }

          val apply = if (isForAll) ForAll else Exists
          var antecedent = range(ids.head, lo, hi)
          for (id <- ids.tail) {
            antecedent = And(antecedent, range(id, lo, hi))
          }
          apply(ids, None,
            if (isForAll) Implies(antecedent, exp)
            else And(antecedent, exp)).asInstanceOf[T]
        case _ => this.asInstanceOf[T]
      }
    simplified
  }
}

final case class ForAll(ids: Node.Seq[Id],
                        domainOpt: Option[QuantDomain],
                        exp: Exp)
  extends Quant[ForAll] {
  override val op: String = "∀"
}

final case class Exists(ids: Node.Seq[Id],
                        domainOpt: Option[QuantDomain],
                        exp: Exp)
  extends Quant[Exists] {
  val op = "∃"
}

sealed trait QuantDomain extends Node {
  def isResolved: Boolean
}

final case class TypeDomain(tpe: Type) extends QuantDomain {
  override def isResolved: Boolean = true
}

final case class RangeDomain(lo: Exp,
                             hi: Exp,
                             loLt: Boolean,
                             hiLt: Boolean) extends QuantDomain with HasInternalData[RangeDomain] {
  var tipe: Tipe = _

  override def isResolved: Boolean = tipe != null && lo.isResolved && hi.isResolved

  override def copy(other: RangeDomain): Unit = {
    tipe = other.tipe
  }
}

final case class SeqLit(tpe: SeqType, args: Node.Seq[Exp]) extends PrimaryExp {
  override def isResolved: Boolean = args.forall(_.isResolved)

  override def buildString(sb: StringBuilder,
                           inProof: Boolean): Unit = {
    tpe.buildString(sb)
    sb.append('(')
    if (args.nonEmpty) {
      args.head.buildString(sb, inProof)
      for (arg <- args.tail) {
        sb.append(", ")
        arg.buildString(sb, inProof)
      }
    }
    sb.append(')')
  }
}

final case class Program(block: Block) extends UnitNode

final case class Block(stmts: Node.Seq[Stmt],
                       returnOpt: Option[Return]) extends Node

final case class Return(expOpt: Option[Exp]) extends Node

sealed trait Stmt extends Node

sealed trait VarAssign extends Stmt {
  def id: Id

  def exp: Exp
}

final case class VarDecl(isVar: Boolean,
                         id: Id,
                         tpe: Type,
                         exp: Exp) extends VarAssign

final case class Assign(id: Id,
                        exp: Exp) extends VarAssign

final case class Assume(exp: Exp) extends Stmt

final case class Assert(exp: Exp) extends Stmt

final case class ExpStmt(exp: Apply) extends Stmt

final case class If(exp: Exp,
                    trueBlock: Block,
                    falseBlock: Block) extends Stmt

final case class While(exp: Exp,
                       block: Block,
                       loopInv: LoopInv) extends Stmt

final case class LoopInv(invariant: Inv,
                         modifies: Modifies) extends Node

final case class Print(isNewline: Boolean,
                       args: Node.Seq[StringOrExp]) extends Stmt {
  var argTipes: ISeq[Option[Tipe]] = ivectorEmpty
}

final case class SeqAssign(id: Id,
                           index: Exp,
                           exp: Exp) extends Stmt

final case class MethodDecl(isHelper: Boolean,
                            isPure: Boolean,
                            id: Id,
                            params: Node.Seq[Param],
                            returnTypeOpt: Option[Type],
                            contract: MethodContract,
                            block: Block)
  extends Stmt

final case class MethodContract(requires: Requires,
                                modifies: Modifies,
                                ensures: Ensures)
  extends Node

final case class Requires(exps: Node.Seq[Exp]) extends Node

final case class Modifies(ids: Node.Seq[Id]) extends Node

final case class Ensures(exps: Node.Seq[Exp]) extends Node

final case class Param(id: Id,
                       tpe: Type) extends Node

sealed trait ProofElementStmt extends Stmt

final case class ProofStmt(proof: Proof) extends ProofElementStmt

final case class SequentStmt(sequent: Sequent) extends ProofElementStmt

final case class InvStmt(inv: Inv) extends ProofElementStmt

final case class Inv(exps: Node.Seq[Exp]) extends Node

final case class FactStmt(fact: Facts) extends ProofElementStmt

final case class Facts(factOrFunDecls: Node.Seq[FactOrFun]) extends Node

sealed trait FactOrFun extends Node

final case class Fact(id: Id,
                      exp: Exp) extends FactOrFun

final case class Fun(id: Id,
                     params: Node.Seq[Param],
                     returnType: Type,
                     funDefs: Node.Seq[FunDef]) extends FactOrFun {
  def isResolved: Boolean =
    id.isResolved && params.forall(_.id.isResolved) && funDefs.forall(_.isResolved)
}

final case class FunDef(id: Id,
                        cond: Exp,
                        exp: Exp) extends Node {
  def isResolved: Boolean = cond.isResolved && exp.isResolved
}

object Type {
  final def normalize(bitWidth: Natural, t: Type): Type =
    t match {
      case _: ZType => bitWidth match {
        case 0 => t
        case 8 => Z8Type()
        case 16 => Z16Type()
        case 32 => Z32Type()
        case 64 => Z64Type()
      }
      case _ => t
    }

  final def toString(t: Type): String = {
    val sb = new StringBuilder
    t.buildString(sb)
    sb.toString
  }
}

sealed trait Type extends Node {
  def buildString(sb: StringBuilder): Unit
}

final case class BType() extends Type {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("B")
}

sealed trait IntegralType extends Type {
  def bitWidth: Int
}

final case class ZType() extends IntegralType {
  val bitWidth = 0

  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z")
}

final case class Z8Type() extends IntegralType {
  val bitWidth = 8

  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z8")
}

final case class Z16Type() extends IntegralType {
  val bitWidth = 16

  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z16")
}

final case class Z32Type() extends IntegralType {
  val bitWidth = 32

  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z32")
}

final case class Z64Type() extends IntegralType {
  val bitWidth = 64

  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z64")
}

final case class NType() extends IntegralType {
  val bitWidth = 0

  override def buildString(sb: StringBuilder): Unit =
    sb.append("N")
}

final case class N8Type() extends IntegralType {
  val bitWidth = 8

  override def buildString(sb: StringBuilder): Unit =
    sb.append("N8")
}

final case class N16Type() extends IntegralType {
  val bitWidth = 16

  override def buildString(sb: StringBuilder): Unit =
    sb.append("N16")
}

final case class N32Type() extends IntegralType {
  val bitWidth = 32

  override def buildString(sb: StringBuilder): Unit =
    sb.append("N32")
}

final case class N64Type() extends IntegralType {
  val bitWidth = 64

  override def buildString(sb: StringBuilder): Unit =
    sb.append("N64")
}

final case class S8Type() extends IntegralType {
  val bitWidth = 8

  override def buildString(sb: StringBuilder): Unit =
    sb.append("S8")
}

final case class S16Type() extends IntegralType {
  val bitWidth = 16

  override def buildString(sb: StringBuilder): Unit =
    sb.append("S16")
}

final case class S32Type() extends IntegralType {
  val bitWidth = 32

  override def buildString(sb: StringBuilder): Unit =
    sb.append("S32")
}

final case class S64Type() extends IntegralType {
  val bitWidth = 64

  override def buildString(sb: StringBuilder): Unit =
    sb.append("S64")
}

final case class U8Type() extends IntegralType {
  val bitWidth = 8

  override def buildString(sb: StringBuilder): Unit =
    sb.append("U8")
}

final case class U16Type() extends IntegralType {
  val bitWidth = 16

  override def buildString(sb: StringBuilder): Unit =
    sb.append("U16")
}

final case class U32Type() extends IntegralType {
  val bitWidth = 32

  override def buildString(sb: StringBuilder): Unit =
    sb.append("U32")
}

final case class U64Type() extends IntegralType {
  val bitWidth = 64

  override def buildString(sb: StringBuilder): Unit =
    sb.append("U64")
}

final case class RType() extends Type {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("R")
}

sealed trait FloatingPointType extends Type

final case class F32Type() extends FloatingPointType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("F32")
}

final case class F64Type() extends FloatingPointType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("F64")
}

sealed trait SeqType extends Type {
  def elementType: Type
}

final case class BSType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("BS")

  override def elementType: Type = BType()
}

final case class ZSType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("ZS")

  override def elementType: Type = ZType()
}

final case class Z8SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z8S")

  override def elementType: Type = Z8Type()
}

final case class Z16SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z16S")

  override def elementType: Type = Z16Type()
}

final case class Z32SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z32S")

  override def elementType: Type = Z32Type()
}

final case class Z64SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("Z64S")

  override def elementType: Type = Z64Type()
}

final case class NSType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("NS")

  override def elementType: Type = NType()
}

final case class N8SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("N8S")

  override def elementType: Type = N8Type()
}

final case class N16SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("N16S")

  override def elementType: Type = N16Type()
}

final case class N32SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("N32S")

  override def elementType: Type = N32Type()
}

final case class N64SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("N64S")

  override def elementType: Type = N64Type()
}

final case class S8SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("S8S")

  override def elementType: Type = S8Type()
}

final case class S16SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("S16S")

  override def elementType: Type = S16Type()
}

final case class S32SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("S32S")

  override def elementType: Type = S32Type()
}

final case class S64SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("S64S")

  override def elementType: Type = S64Type()
}

final case class U8SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("U8S")

  override def elementType: Type = U8Type()
}

final case class U16SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("U16S")

  override def elementType: Type = U16Type()
}

final case class U32SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("U32S")

  override def elementType: Type = U32Type()
}

final case class U64SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("U64S")

  override def elementType: Type = U64Type()
}

final case class RSType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("RS")

  override def elementType: Type = RType()
}

final case class F32SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("F32S")

  override def elementType: Type = F32Type()
}

final case class F64SType() extends SeqType {
  override def buildString(sb: StringBuilder): Unit =
    sb.append("F64S")

  override def elementType: Type = F64Type()
}
