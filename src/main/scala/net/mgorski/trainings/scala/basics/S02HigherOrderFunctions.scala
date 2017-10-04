package net.mgorski.trainings.scala.basics

/**
  * Created by ski on 04/10/2017.
  */
object S02HigherOrderFunctions {

  def main(args: Array[String]) {
    // print scale
    println("4!=" + factorial(4))


    for (i <- 0 to 10) {
      println("Fib(%d)=%d".format(i, fib(i)))
    }
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)
    go(n, 1)
  }


  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

}
