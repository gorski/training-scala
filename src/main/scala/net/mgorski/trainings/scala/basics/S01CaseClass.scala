package net.mgorski.trainings.scala.basics

/**
  * S01 : case class (only one default constructor)
  */
case class S01CaseClass(cc: BigDecimal) {

  def printValue: Unit = {
    println("Value:" + cc)

    val absResult: String = formatAbs(-10)
    println(absResult)
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }


}

object S01Run {
  def main(args: Array[String]) {
    S01CaseClass(1).printValue
  }
}
