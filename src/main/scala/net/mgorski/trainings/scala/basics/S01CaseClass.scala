package net.mgorski.trainings.scala.basics

/**
  * Case Class - basic syntax
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
