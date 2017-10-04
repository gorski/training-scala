package net.mgorski.trainings.scala

import net.mgorski.trainings.scala.basics.CaseClass

object BasicsApp  {
  def main(args: Array[String]) {
    println("Hello, world!")

    // case class (no new, method call not paranthesis)
    CaseClass(1).printValue
  }
}

