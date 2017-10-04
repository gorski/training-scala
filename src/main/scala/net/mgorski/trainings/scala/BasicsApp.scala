package net.mgorski.trainings.scala

import net.mgorski.trainings.scala.basics.S01CaseClass

object BasicsApp  {
  def main(args: Array[String]) {
    println("mgorski.net : trainings")

    // case class (no new, method call not paranthesis)
    S01CaseClass(1).printValue
  }
}

