/*
Copyright (c) 2015, Robby, Kansas State University
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

package org.sireum.logika.util

import org.sireum.logika.ast._
import org.sireum.logika.tipe._
import org.sireum.util.jvm._
import org.sireum.util._

import org.stringtemplate.v4._

object Z3 {
  val stg: STGroup = new STGroupFile(getClass.
    getResource("z3.stg"), "UTF-8", '$', '$')

  val z3: String = {
    import java.io._
    val z3Filename = OsUtil.detect match {
      case OsArch.Win => "z3.exe"
      case _ => "z3"
    }
    val z3Bin = new File(System.getenv("SIREUM_HOME"), s"/apps/z3/bin/$z3Filename")
    if (z3Bin.canExecute) z3Bin.getAbsolutePath
    else z3Filename
  }

  def isValid(exp: Exp)(
    implicit nodeLocMap: MIdMap[Node, LocationInfo]) =
    new Z3().isValid(exp)
}

private final class Z3(implicit nodeLocMap: MIdMap[Node, LocationInfo]) {

  import Z3._

  val typeMap: MMap[String, Tipe] = mmapEmpty[String, Tipe]
  val lineSep = scala.util.Properties.lineSeparator
  var zsCounter = 0
  val stMain = stg.getInstanceOf("main")

  def isValid(e: Exp): Boolean = {
    stMain.add("e", translate(e))
    Visitor.build({
      case q: Quant =>
        for (id <- q.ids) {
          typeMap -= id.value
        }
        true
    })
    for ((name, tipe) <- typeMap) {
      stMain.add("d", translate(name, tipe)).
        add("d", lineSep)
    }
    val z3Script = stMain.render()
    val result = {
      val input =
        OsUtil.detect match {
          case OsArch.Win =>
            ivector(z3, "/smt2", "/in")
          case _ =>
            ivector(z3, "-smt2", "-in")
        }
      new Exec().run(0, input, Some(z3Script), None)
    }

    result match {
      case Exec.StringResult(s, _) =>
        s.substring(0, s.indexOf('\n')).trim match {
          case "unsat" => true
          case "unknown" | "sat" => false
          case _ =>
            Console.err.println("Error occurred when calling Z3 for the following script.")
            Console.err.println(z3Script)
            Console.err.println(s)
            Console.err.flush()
            false
        }
      case Exec.Timeout => false
      case Exec.ExceptionRaised(err) =>
        Console.err.println(s"Error occurred when calling Z3 for the following script: ${err.getMessage}")
        Console.err.println(z3Script)
        Console.err.flush()
        false
    }
  }

  def translate(e: Exp): ST =
    (e: @unchecked) match {
      case BooleanLit(value) =>
        stg.getInstanceOf(if (value) "truelit" else "falselit")
      case id: Id =>
        typeMap(id.value) = id.tipe
        stg.getInstanceOf("id").add("value", id.value)
      case Size(id) =>
        stg.getInstanceOf("size").add("id", translate(id))
      case e: Result =>
        val id = Id("result")
        id.tipe = e.tipe
        translate(id)
      case e: Apply =>
        if (e.id.tipe == ZS)
          stg.getInstanceOf("index").add("a", translate(e.id)).
            add("i", translate(e.args.head))
        else {
          val r = stg.getInstanceOf("apply").add("id", translate(e.id))
          for (arg <- e.args) r.add("exp", translate(arg))
          r
        }
      case IntLit(value) =>
        stg.getInstanceOf("int").add("value", value)
      case Prepend(left, right) =>
        val c = zs()
        val a = translate(right)
        val v = translate(left)
        stMain.add("a",
          stg.getInstanceOf("prepend").add("c", c).add("a", a).add("v", v)).
          add("a", lineSep)
        stg.getInstanceOf("a").add("c", c)
      case Append(left, right) =>
        val c = zs()
        val a = translate(left)
        val v = translate(right)
        stMain.add("a",
          stg.getInstanceOf("append").add("c", c).add("a", a).add("v", v)).
          add("a", lineSep)
        stg.getInstanceOf("a").add("c", c)
      case e: BinaryExp =>
        val op =
          (e: @unchecked) match {
            case Ne(left, right) => return translate(Not(Eq(left, right)))
            case e: Mul => "*"
            case e: Div => "div"
            case e: Rem => "rem"
            case e: Add => "+"
            case e: Sub => "-"
            case e: Lt => "<"
            case e: Le => "<="
            case e: Gt => ">"
            case e: Ge => ">="
            case e: Eq => "="
            case e: And => "and"
            case e: Or => "or"
            case e: Implies => "=>"
          }
        stg.getInstanceOf("binary").add("op", op).
          add("left", translate(e.left)).add("right", translate(e.right))
      case Not(exp) =>
        stg.getInstanceOf("unary").add("op", "!").
          add("exp", translate(exp))
      case Minus(exp) =>
        stg.getInstanceOf("unary").add("op", "-").
          add("exp", translate(exp))
      case e: Quant =>
        val isForAll = e.isInstanceOf[ForAll]
        val stType = (e.domainOpt: @unchecked) match {
          case Some(RangeDomain(lo, hi)) =>
            return translate(e.simplify)
          case Some(TypeDomain(tpe)) => translate(tpe)
        }
        val st = stg.getInstanceOf("quant").
          add("op", if (isForAll) "forall" else "exists").
          add("exp", translate(e.exp))
        for (id <- e.ids)
          stg.getInstanceOf("param").add("id", translate(id)).
            add("tipe", stType)
        st
      case e: SeqLit =>
        val c = zs()
        val stZs = stg.getInstanceOf("zs").add("c", c)
        if (e.args.isEmpty)
          stZs.add("exp", "_empty")
        else {
          val args = e.args.reverse
          var i = e.args.size - 2
          var stZsExp = stg.getInstanceOf("zsexp").add("i", i + 1).
            add("v", translate(args.head))
          for (arg <- args.tail) {
            stZsExp = stg.getInstanceOf("zsexp").add("i", i).
              add("v", translate(arg)).add("a", stZsExp)
            i -= 1
          }

        }
        stMain.add("a", stZs).add("a", lineSep)
        stg.getInstanceOf("a").add("c", c)
    }

  def zs(): Int = {
    val r = zsCounter
    zsCounter += 1
    r
  }

  def translate(name: String, tipe: Tipe): ST =
    (tipe: @unchecked) match {
      case B => stg.getInstanceOf("bconst").add("name", name)
      case Z => stg.getInstanceOf("zconst").add("name", name)
      case ZS => stg.getInstanceOf("zsconst").add("name", name)
      case tipe: FunTipe =>
        val st = stg.getInstanceOf("fun").add("name", name).
          add("result", translate(tipe.result))
        for (p <- tipe.params) {
          st.add("param", translate(p))
        }
        st
    }

  def translate(tipe: Tipe): String = (tipe: @unchecked) match {
    case B => "B"
    case Z => "Z"
    case ZS => "ZS"
  }

  def translate(tpe: Type): String = tpe match {
    case _: BooleanType => "B"
    case _: IntType => "Z"
    case _: IntSeqType => "SZ"
  }
}
