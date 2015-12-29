Sireum Logika
=============

Logika is a natural deduction proof checker for propositional, predicate, and programming logic being
developed for teaching [K-State CIS 301: Logical Foundations of Programming](http://proglogics.santoslab.org).

Logika is inspired by:

* The [Natural Deduction Proof Checker (NDPC)](http://people.cis.ksu.edu/~schmidt/301s14/NDPC/ndpc-pe.jar)
  tool ([User's Guide](http://people.cis.ksu.edu/~schmidt/301s14/NDPC/user_manual.pdf))
  for propositional and predicate logic developed by Mr. Brian Mulanda, Dr. Rodney Howell, and 
  Mr. James Thompson.

* The [Floyd-Hoare Program Logic Proof Checker](http://people.cis.ksu.edu/~schmidt/301s14/cis301.zip)
  and the [Programming Logic](http://people.cis.ksu.edu/~schmidt/301s14/Lectures/home.html)
  lecture notes by Distinguished Professor Emeritus David Schmidt.

Logika is a combination of both tools; it uses the same
[input language](https://github.com/santoslab/sireum-v3/blob/master/logika/sireum-logika-parser-antlr4/src/main/resources/org/sireum/logika/parser/Antlr4Logika.g4)
for reasoning about propositional, predicate, and programming logic (i.e., the propositional logic 
input language is a subset of the predicate logic input language, which in turn, is a subset of the
programming logic input language).
The programming input language is a restricted subset of the Scala programming language that can be
run by using the regular Scala interpreter.

Currently, the propositional and predicate logic proof checker portion of the tool has been fully
implemented; the programming logic proof checker has been implemented up to the type checking phase
and the interface to the [Z3](https://github.com/Z3Prover/z3) high-performing SMT solver.

Some examples are available at the following links:

* [Propositional and predicate logic examples](https://github.com/santoslab/sireum-v3/blob/master/logika/sireum-logika-test/src/main/scala/org/sireum/logika/SequentTestDefProvider.scala)
  (status: **all verified**)

* [Programming logic examples](https://github.com/santoslab/sireum-v3/tree/master/logika/sireum-logika-test/src/test/resources/org/sireum/logika)
  (status: parsed, AST built, symbol resolved, type checked, and Z3 interface implemented; all examples runnable by the Scala interpreter, which requires 
  the [Logika runtime library](https://github.com/santoslab/sireum-v3/blob/master/logika/sireum-logika/src/main/scala/org/sireum/logika/package.scala))

Running Logika
--------------

The propositional and predicate logic proof checker can be run via the command line.
Here is an example:
```
¬(¬p ∨ ¬q) ⊢ p ∧ q
{
  1. ¬(¬p ∨ ¬q)         premise
  2. {
       3. ¬p            assume
       4. ¬p ∨ ¬q       ∨i1 3 
       5. ⊥             ¬e 4 1
     }
  6. p                  Pbc 2
  7. {
       8. ¬q            assume
       9. ¬p ∨ ¬q       ∨i2 8 
      10. ⊥             ¬e 9 1
     }
 11. q                  Pbc 7
 12. p ∧ q              ∧i 6 11
}
```
To run Logika, save the above example in a file (e.g., `test.txt`) and then issue the command
(provided that you follow the instructions above to build and run Sireum):
```bash
sireum logika test.txt
```
which will show:
```
Propositional logic proof is accepted.
```
If one introduced a "bug" in the proof, such as using ∨i1 instead of ∨i2 in step #9 in the above example,
Logika will output:
```
[12, 10] The disjunction's left sub-expression in step #9 does not match #8 for Or-intro1.
Propositional logic proof is rejected.
```
One can specify the sequent to prove as a command line to ensure that the proof in the file is
the one that is expected as follows:
```bash
sireum logika -s "¬(¬p ∨ ¬q) ⊢ p ∧ q" test.txt
```
If the provided sequent is different than the one in the file, the tool rejects it. For example:
```bash
sireum logika -s "p, q ⊢ p ∧ q" test.txt
```
will result:
```
The specified sequent is different than the one in the file.
Specified:
p, q ⊢ p ∧ q
File:
¬(¬p ∨ ¬q) ⊢ p ∧ q
```