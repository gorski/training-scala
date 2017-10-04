package net.mgorski.trainings.scala.basics

/**
  * Created by ski on 03/10/2017.
  */
case class CaseClass(cc:BigDecimal) {

  def printValue: Unit = {
    print("Value:"+cc)
  }

}
