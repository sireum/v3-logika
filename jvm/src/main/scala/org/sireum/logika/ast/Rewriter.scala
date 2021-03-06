/*
Copyright (c) 2019, Robby, Kansas State University
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

// @formatter:off
// This file was auto-generated from org.sireum.logika.ast.Node

package org.sireum.logika.ast

import org.sireum.util._

object Rewriter {
  import org.sireum.util.Rewriter._

  val constructorMap : ConstructorMap = Map(
    ("Add", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Add(left, right)
    }),
    ("Algebra", { es =>
      val Seq(num: Num, exp: Exp, nums: IVector[_]) = es.toSeq
org.sireum.logika.ast.Algebra(num, exp, cast(nums))
    }),
    ("And", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.And(left, right)
    }),
    ("AndElim1", { es =>
      val Seq(num: Num, exp: Exp, andStep: Num) = es.toSeq
org.sireum.logika.ast.AndElim1(num, exp, andStep)
    }),
    ("AndElim2", { es =>
      val Seq(num: Num, exp: Exp, andStep: Num) = es.toSeq
org.sireum.logika.ast.AndElim2(num, exp, andStep)
    }),
    ("AndIntro", { es =>
      val Seq(num: Num, exp: And, leftStep: Num, rightStep: Num) = es.toSeq
org.sireum.logika.ast.AndIntro(num, exp, leftStep, rightStep)
    }),
    ("Append", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Append(left, right)
    }),
    ("Apply", { es =>
      val Seq(exp: Exp, args: IVector[_]) = es.toSeq
      org.sireum.logika.ast.Apply(exp, cast(args))
    }),
    ("Assert", { es =>
      val Seq(exp: Exp) = es.toSeq
org.sireum.logika.ast.Assert(exp)
    }),
    ("Assign", { es =>
      val Seq(id: Id, exp: Exp) = es.toSeq
org.sireum.logika.ast.Assign(id, exp)
    }),
    ("Assignments", { es =>
      val Seq(value: IVector[_]) = es.toSeq
org.sireum.logika.ast.Assignments(cast(value))
    }),
    ("Assume", { es =>
      val Seq(exp: Exp) = es.toSeq
org.sireum.logika.ast.Assume(exp)
    }),
    ("Auto", { es =>
      val Seq(num: Num, exp: Exp, steps: IVector[_]) = es.toSeq
org.sireum.logika.ast.Auto(num, exp, cast(steps))
    }),
    ("BSType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.BSType()
    }),
    ("BType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.BType()
    }),
    ("Block", { es =>
      val Seq(stmts: IVector[_], returnOpt: Option[_]) = es.toSeq
org.sireum.logika.ast.Block(cast(stmts), cast(returnOpt))
    }),
    ("BooleanLit", { es =>
      val Seq(value: java.lang.Boolean) = es.toSeq
org.sireum.logika.ast.BooleanLit(value)
    }),
    ("BottomElim", { es =>
      val Seq(num: Num, exp: Exp, falseStep: Num) = es.toSeq
org.sireum.logika.ast.BottomElim(num, exp, falseStep)
    }),
    ("Clone", { es =>
      val Seq(id: Id) = es.toSeq
org.sireum.logika.ast.Clone(id)
    }),
    ("ContingentStatus", { es =>
      val Seq(trueAssignments: IVector[_], falseAssignments: IVector[_]) = es.toSeq
org.sireum.logika.ast.ContingentStatus(cast(trueAssignments), cast(falseAssignments))
    }),
    ("ContradictoryStatus", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.ContradictoryStatus()
    }),
    ("Div", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Div(left, right)
    }),
    ("Ensures", { es =>
      val Seq(exps: IVector[_]) = es.toSeq
org.sireum.logika.ast.Ensures(cast(exps))
    }),
    ("Eq", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Eq(left, right)
    }),
    ("Exists", { es =>
      val Seq(ids: IVector[_], domainOpt: Option[_], exp: Exp) = es.toSeq
org.sireum.logika.ast.Exists(cast(ids), cast(domainOpt), exp)
    }),
    ("ExistsAssumeStep", { es =>
      val Seq(num: Num, id: Id, typeOpt: Option[_], exp: Exp) = es.toSeq
org.sireum.logika.ast.ExistsAssumeStep(num, id, cast(typeOpt), exp)
    }),
    ("ExistsElim", { es =>
      val Seq(num: Num, exp: Exp, step: Num, subProof: Num) = es.toSeq
org.sireum.logika.ast.ExistsElim(num, exp, step, subProof)
    }),
    ("ExistsIntro", { es =>
      val Seq(num: Num, exp: Exists, step: Num, args: IVector[_]) = es.toSeq
org.sireum.logika.ast.ExistsIntro(num, exp, step, cast(args))
    }),
    ("ExpStmt", { es =>
      val Seq(exp: Apply) = es.toSeq
org.sireum.logika.ast.ExpStmt(exp)
    }),
    ("F32SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.F32SType()
    }),
    ("F32Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.F32Type()
    }),
    ("F64SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.F64SType()
    }),
    ("F64Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.F64Type()
    }),
    ("Fact", { es =>
      val Seq(id: Id, exp: Exp) = es.toSeq
org.sireum.logika.ast.Fact(id, exp)
    }),
    ("FactJust", { es =>
      val Seq(num: Num, exp: Exp, id: Id) = es.toSeq
org.sireum.logika.ast.FactJust(num, exp, id)
    }),
    ("FactStmt", { es =>
      val Seq(fact: Facts) = es.toSeq
org.sireum.logika.ast.FactStmt(fact)
    }),
    ("Facts", { es =>
      val Seq(factOrFunDecls: IVector[_]) = es.toSeq
org.sireum.logika.ast.Facts(cast(factOrFunDecls))
    }),
    ("FloatLit", { es =>
      val Seq(value: String) = es.toSeq
org.sireum.logika.ast.FloatLit(value)
    }),
    ("ForAll", { es =>
      val Seq(ids: IVector[_], domainOpt: Option[_], exp: Exp) = es.toSeq
      org.sireum.logika.ast.ForAll(cast(ids), cast(domainOpt), exp)
    }),
    ("ForAllAssumeStep", { es =>
      val Seq(num: Num, id: Id, typeOpt: Option[_]) = es.toSeq
org.sireum.logika.ast.ForAllAssumeStep(num, id, cast(typeOpt))
    }),
    ("ForAllElim", { es =>
      val Seq(num: Num, exp: Exp, step: Num, args: IVector[_]) = es.toSeq
org.sireum.logika.ast.ForAllElim(num, exp, step, cast(args))
    }),
    ("ForAllIntro", { es =>
      val Seq(num: Num, exp: ForAll, subProof: Num) = es.toSeq
org.sireum.logika.ast.ForAllIntro(num, exp, subProof)
    }),
    ("Fun", { es =>
      val Seq(id: Id, params: IVector[_], returnType: Type, funDefs: IVector[_]) = es.toSeq
org.sireum.logika.ast.Fun(id, cast(params), returnType, cast(funDefs))
    }),
    ("FunDef", { es =>
      val Seq(id: Id, cond: Exp, exp: Exp) = es.toSeq
org.sireum.logika.ast.FunDef(id, cond, exp)
    }),
    ("Ge", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Ge(left, right)
    }),
    ("Gt", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Gt(left, right)
    }),
    ("Id", { es =>
      val Seq(value: String) = es.toSeq
org.sireum.logika.ast.Id(value)
    }),
    ("If", { es =>
      val Seq(exp: Exp, trueBlock: Block, falseBlock: Block) = es.toSeq
org.sireum.logika.ast.If(exp, trueBlock, falseBlock)
    }),
    ("Implies", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Implies(left, right)
    }),
    ("ImpliesElim", { es =>
      val Seq(num: Num, exp: Exp, impliesStep: Num, antecedentStep: Num) = es.toSeq
org.sireum.logika.ast.ImpliesElim(num, exp, impliesStep, antecedentStep)
    }),
    ("ImpliesIntro", { es =>
      val Seq(num: Num, exp: Implies, subProof: Num) = es.toSeq
      org.sireum.logika.ast.ImpliesIntro(num, exp, subProof)
    }),
    ("IntLit", { es =>
      val Seq(value: String, bitWidth: java.lang.Integer, tpeOpt: Option[_]) = es.toSeq
org.sireum.logika.ast.IntLit(value, bitWidth, cast(tpeOpt))
    }),
    ("IntMax", { es =>
      val Seq(bitWidth: java.lang.Integer, integralType: IntegralType) = es.toSeq
org.sireum.logika.ast.IntMax(bitWidth, integralType)
    }),
    ("IntMin", { es =>
      val Seq(bitWidth: java.lang.Integer, integralType: IntegralType) = es.toSeq
org.sireum.logika.ast.IntMin(bitWidth, integralType)
    }),
    ("Inv", { es =>
      val Seq(exps: IVector[_]) = es.toSeq
org.sireum.logika.ast.Inv(cast(exps))
    }),
    ("InvStmt", { es =>
      val Seq(inv: Inv) = es.toSeq
org.sireum.logika.ast.InvStmt(inv)
    }),
    ("Invariant", { es =>
      val Seq(num: Num, exp: Exp) = es.toSeq
org.sireum.logika.ast.Invariant(num, exp)
    }),
    ("Le", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Le(left, right)
    }),
    ("LoopInv", { es =>
      val Seq(invariant: Inv, modifies: Modifies) = es.toSeq
org.sireum.logika.ast.LoopInv(invariant, modifies)
    }),
    ("Lt", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Lt(left, right)
    }),
    ("MethodContract", { es =>
      val Seq(requires: Requires, modifies: Modifies, ensures: Ensures) = es.toSeq
org.sireum.logika.ast.MethodContract(requires, modifies, ensures)
    }),
    ("MethodDecl", { es =>
      val Seq(isHelper: java.lang.Boolean, isPure: java.lang.Boolean, id: Id, params: IVector[_], returnTypeOpt: Option[_], contract: MethodContract, block: Block) = es.toSeq
org.sireum.logika.ast.MethodDecl(isHelper, isPure, id, cast(params), cast(returnTypeOpt), contract, block)
    }),
    ("Minus", { es =>
      val Seq(exp: Exp) = es.toSeq
org.sireum.logika.ast.Minus(exp)
    }),
    ("Modifies", { es =>
      val Seq(ids: IVector[_]) = es.toSeq
org.sireum.logika.ast.Modifies(cast(ids))
    }),
    ("Mul", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Mul(left, right)
    }),
    ("N16SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N16SType()
    }),
    ("N16Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N16Type()
    }),
    ("N32SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N32SType()
    }),
    ("N32Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N32Type()
    }),
    ("N64SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N64SType()
    }),
    ("N64Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N64Type()
    }),
    ("N8SType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N8SType()
    }),
    ("N8Type", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.N8Type()
    }),
    ("NSType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.NSType()
    }),
    ("NType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.NType()
    }),
    ("Ne", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Ne(left, right)
    }),
    ("NegElim", { es =>
      val Seq(num: Num, exp: Exp, step: Num, negStep: Num) = es.toSeq
org.sireum.logika.ast.NegElim(num, exp, step, negStep)
    }),
    ("NegIntro", { es =>
      val Seq(num: Num, exp: Not, subProof: Num) = es.toSeq
org.sireum.logika.ast.NegIntro(num, exp, subProof)
    }),
    ("Not", { es =>
      val Seq(exp: Exp) = es.toSeq
org.sireum.logika.ast.Not(exp)
    }),
    ("Num", { es =>
      val Seq(value: java.lang.Integer) = es.toSeq
org.sireum.logika.ast.Num(value)
    }),
    ("Or", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Or(left, right)
    }),
    ("OrElim", { es =>
      val Seq(num: Num, exp: Exp, orStep: Num, leftSubProof: Num, rightSubProof: Num) = es.toSeq
org.sireum.logika.ast.OrElim(num, exp, orStep, leftSubProof, rightSubProof)
    }),
    ("OrIntro1", { es =>
      val Seq(num: Num, exp: Or, step: Num) = es.toSeq
org.sireum.logika.ast.OrIntro1(num, exp, step)
    }),
    ("OrIntro2", { es =>
      val Seq(num: Num, exp: Or, step: Num) = es.toSeq
org.sireum.logika.ast.OrIntro2(num, exp, step)
    }),
    ("Param", { es =>
      val Seq(id: Id, tpe: Type) = es.toSeq
org.sireum.logika.ast.Param(id, tpe)
    }),
    ("Pbc", { es =>
      val Seq(num: Num, exp: Exp, subProof: Num) = es.toSeq
org.sireum.logika.ast.Pbc(num, exp, subProof)
    }),
    ("PlainAssumeStep", { es =>
      val Seq(num: Num, exp: Exp) = es.toSeq
org.sireum.logika.ast.PlainAssumeStep(num, exp)
    }),
    ("Premise", { es =>
      val Seq(num: Num, exp: Exp) = es.toSeq
org.sireum.logika.ast.Premise(num, exp)
    }),
    ("Prepend", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
org.sireum.logika.ast.Prepend(left, right)
    }),
    ("Print", { es =>
      val Seq(isNewline: java.lang.Boolean, args: IVector[_]) = es.toSeq
org.sireum.logika.ast.Print(isNewline, cast(args))
    }),
    ("Program", { es =>
      val Seq(block: Block) = es.toSeq
org.sireum.logika.ast.Program(block)
    }),
    ("Proof", { es =>
      val Seq(steps: IVector[_]) = es.toSeq
org.sireum.logika.ast.Proof(cast(steps))
    }),
    ("ProofStmt", { es =>
      val Seq(proof: Proof) = es.toSeq
org.sireum.logika.ast.ProofStmt(proof)
    }),
    ("RSType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.RSType()
    }),
    ("RType", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.RType()
    }),
    ("Random", { es =>
      val Seq(tpe: Type) = es.toSeq
org.sireum.logika.ast.Random(tpe)
    }),
    ("RandomInt", { es =>
      val Seq() = es.toSeq
org.sireum.logika.ast.RandomInt()
    }),
    ("RangeDomain", { es =>
      val Seq(lo: Exp, hi: Exp, loLt: java.lang.Boolean, hiLt: java.lang.Boolean) = es.toSeq
      org.sireum.logika.ast.RangeDomain(lo, hi, loLt, hiLt)
    }),
    ("ReadInt", { es =>
      val Seq(msgOpt: Option[_]) = es.toSeq
      org.sireum.logika.ast.ReadInt(cast(msgOpt))
    }),
    ("RealLit", { es =>
      val Seq(value: String) = es.toSeq
      org.sireum.logika.ast.RealLit(value)
    }),
    ("Rem", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Rem(left, right)
    }),
    ("Requires", { es =>
      val Seq(exps: IVector[_]) = es.toSeq
      org.sireum.logika.ast.Requires(cast(exps))
    }),
    ("Result", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Result()
    }),
    ("Return", { es =>
      val Seq(expOpt: Option[_]) = es.toSeq
      org.sireum.logika.ast.Return(cast(expOpt))
    }),
    ("S16SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S16SType()
    }),
    ("S16Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S16Type()
    }),
    ("S32SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S32SType()
    }),
    ("S32Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S32Type()
    }),
    ("S64SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S64SType()
    }),
    ("S64Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S64Type()
    }),
    ("S8SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S8SType()
    }),
    ("S8Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.S8Type()
    }),
    ("SeqAssign", { es =>
      val Seq(id: Id, index: Exp, exp: Exp) = es.toSeq
      org.sireum.logika.ast.SeqAssign(id, index, exp)
    }),
    ("SeqLit", { es =>
      val Seq(tpe: SeqType, args: IVector[_]) = es.toSeq
      org.sireum.logika.ast.SeqLit(tpe, cast(args))
    }),
    ("Sequent", { es =>
      val Seq(premises: IVector[_], conclusions: IVector[_], proofOpt: Option[_]) = es.toSeq
      org.sireum.logika.ast.Sequent(cast(premises), cast(conclusions), cast(proofOpt))
    }),
    ("SequentStmt", { es =>
      val Seq(sequent: Sequent) = es.toSeq
      org.sireum.logika.ast.SequentStmt(sequent)
    }),
    ("Shl", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Shl(left, right)
    }),
    ("Shr", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Shr(left, right)
    }),
    ("Size", { es =>
      val Seq(exp: Exp) = es.toSeq
      org.sireum.logika.ast.Size(exp)
    }),
    ("StringLit", { es =>
      val Seq(value: String) = es.toSeq
      org.sireum.logika.ast.StringLit(value)
    }),
    ("Sub", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Sub(left, right)
    }),
    ("SubProof", { es =>
      val Seq(num: Num, assumeStep: AssumeStep, steps: IVector[_]) = es.toSeq
      org.sireum.logika.ast.SubProof(num, assumeStep, cast(steps))
    }),
    ("Subst1", { es =>
      val Seq(num: Num, exp: Exp, eqStep: Num, step: Num) = es.toSeq
      org.sireum.logika.ast.Subst1(num, exp, eqStep, step)
    }),
    ("Subst2", { es =>
      val Seq(num: Num, exp: Exp, eqStep: Num, step: Num) = es.toSeq
      org.sireum.logika.ast.Subst2(num, exp, eqStep, step)
    }),
    ("TautologyStatus", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.TautologyStatus()
    }),
    ("TruthTable", { es =>
      val Seq(star: TruthTableMarker, ids: IVector[_], bar: TruthTableMarker, formula: Exp, rows: IVector[_], statusOpt: Option[_]) = es
      org.sireum.logika.ast.TruthTable(star, cast(ids), bar, formula, cast(rows), cast(statusOpt))
    }),
    ("TruthTableMarker", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.TruthTableMarker()
    }),
    ("TruthTableRow", { es =>
      val Seq(assignments: Assignments, bar: TruthTableMarker, values: IVector[_]) = es.toSeq
      org.sireum.logika.ast.TruthTableRow(assignments, bar, cast(values))
    }),
    ("TypeDomain", { es =>
      val Seq(tpe: Type) = es.toSeq
      org.sireum.logika.ast.TypeDomain(tpe)
    }),
    ("TypeMethodCallExp", { es =>
      val Seq(tpe: Type, id: Id, args: IVector[_]) = es.toSeq
      org.sireum.logika.ast.TypeMethodCallExp(tpe, id, cast(args))
    }),
    ("U16SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U16SType()
    }),
    ("U16Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U16Type()
    }),
    ("U32SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U32SType()
    }),
    ("U32Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U32Type()
    }),
    ("U64SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U64SType()
    }),
    ("U64Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U64Type()
    }),
    ("U8SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U8SType()
    }),
    ("U8Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.U8Type()
    }),
    ("UShr", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.UShr(left, right)
    }),
    ("VarDecl", { es =>
      val Seq(isVar: java.lang.Boolean, id: Id, tpe: Type, exp: Exp) = es.toSeq
      org.sireum.logika.ast.VarDecl(isVar, id, tpe, exp)
    }),
    ("While", { es =>
      val Seq(exp: Exp, block: Block, loopInv: LoopInv) = es.toSeq
      org.sireum.logika.ast.While(exp, block, loopInv)
    }),
    ("Xor", { es =>
      val Seq(left: Exp, right: Exp) = es.toSeq
      org.sireum.logika.ast.Xor(left, right)
    }),
    ("Z16SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z16SType()
    }),
    ("Z16Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z16Type()
    }),
    ("Z32SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z32SType()
    }),
    ("Z32Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z32Type()
    }),
    ("Z64SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z64SType()
    }),
    ("Z64Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z64Type()
    }),
    ("Z8SType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z8SType()
    }),
    ("Z8Type", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.Z8Type()
    }),
    ("ZSType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.ZSType()
    }),
    ("ZType", { es =>
      val Seq() = es.toSeq
      org.sireum.logika.ast.ZType()
    })
  )

  def build[T](mode: TraversalMode.Type = TraversalMode.TOP_DOWN)(
    f: RewriteFunction) =
    org.sireum.util.Rewriter.build[T](constructorMap)(mode, f)

  def buildEnd[T](mode: TraversalMode.Type = TraversalMode.TOP_DOWN)(
      f: RewriteFunction, g: RewriteFunction) =
    org.sireum.util.Rewriter.buildEnd[T](constructorMap)(mode, f, g)
}