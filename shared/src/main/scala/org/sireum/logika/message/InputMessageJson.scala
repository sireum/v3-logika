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
// This file was auto-generated from org.sireum.logika.message.InputMessage

package org.sireum.logika.message

import org.sireum.util.Json._

object InputMessageJson {
  import scala.language.implicitConversions

  implicit def fromInputMessage(o: org.sireum.logika.message.InputMessage): ujson.Obj =
    o match {
      case o: org.sireum.logika.message.Check =>
        ujson.Obj(
          (".class", ujson.Str("Check")),
          ("requestId", fromStr(o.requestId)),
          ("isBackground", fromAnyVal(o.isBackground)),
          ("kind", fromStr(o.kind)),
          ("hintEnabled", fromAnyVal(o.hintEnabled)),
          ("inscribeSummoningsEnabled", fromAnyVal(o.inscribeSummoningsEnabled)),
          ("coneInfluenceEnabled", fromAnyVal(o.coneInfluenceEnabled)),
          ("proofs", fromSeq(o.proofs)(fromInputMessage)),
          ("lastOnly", fromAnyVal(o.lastOnly)),
          ("autoEnabled", fromAnyVal(o.autoEnabled)),
          ("timeout", fromAnyVal(o.timeout)),
          ("checkSatEnabled", fromAnyVal(o.checkSatEnabled)),
          ("bitWidth", fromAnyVal(o.bitWidth)),
          ("loopBound", fromAnyVal(o.loopBound)),
          ("recursionBound", fromAnyVal(o.recursionBound)),
          ("useMethodContract", fromAnyVal(o.useMethodContract))
        )
      case o: org.sireum.logika.message.ProofFile =>
        ujson.Obj(
          (".class", ujson.Str("ProofFile")),
          ("fileUriOpt", fromOption(o.fileUriOpt)(fromStr)),
          ("content", fromStr(o.content))
        )
      case org.sireum.logika.message.Terminate =>
        ujson.Obj((".class", ujson.Str("Terminate")))
    }

  implicit def toInputMessage[T <: org.sireum.logika.message.InputMessage](v: ujson.Value): T =
    (v: @unchecked) match {
      case o: ujson.Obj =>
        (o.value.head._2.asInstanceOf[ujson.Str].value match {
           case "Check" =>
             org.sireum.logika.message.Check(toStr(o.value.toSeq(1)._2), toBoolean(o.value.toSeq(2)._2), toStr(o.value.toSeq(3)._2), toBoolean(o.value.toSeq(4)._2), toBoolean(o.value.toSeq(5)._2), toBoolean(o.value.toSeq(6)._2), toVector(o.value.toSeq(7)._2)(toInputMessage[ProofFile]), toBoolean(o.value.toSeq(8)._2), toBoolean(o.value.toSeq(9)._2), toInt(o.value.toSeq(10)._2), toBoolean(o.value.toSeq(11)._2), toInt(o.value.toSeq(12)._2), toInt(o.value.toSeq(13)._2), toInt(o.value.toSeq(14)._2), toBoolean(o.value.toSeq(15)._2))
           case "ProofFile" =>
             org.sireum.logika.message.ProofFile(toOption(o.value.toSeq(1)._2)(toStr), toStr(o.value.toSeq(2)._2))
           case "Terminate" => org.sireum.logika.message.Terminate
         }).asInstanceOf[T]
    }
}