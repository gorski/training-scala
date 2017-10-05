package net.mgorski.trainings.scala.basics

/**
  * S03: polymorphism + find in array
  */
object S03PolymorphicFunction {

  def main(args: Array[String]) {
    val z = Array("Zara", "Nuha", "Ayan")
    println("Find (Ayan): "+ findFirst(z, p, "Ayan"))

    // using method
    println("Is sorted (gt): "+ isSorted(z, gt))

    // anonymous fcs
    println("Is sorted: "+ isSorted(z, (a:String, b:String) => a>b))
    println("Is reverse-sorted: "+ isSorted(z, (a:String, b:String) => a<b))
  }


  // find index of value
  def findFirst[A](as: Array[A], p: (A,A) => Boolean, lookup:A): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1 else if (p(as(n), lookup)) n else loop(n + 1)
    loop(0)
  }

  def p(f: String, lookup: String): Boolean = {
    println("Value:" + f)
    lookup == f
  }


  // 2: is array sorted?
  def gt(a:String,b:String) : Boolean = {
    a > b
  }

  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length-1) true
      else if (gt(as(n), as(n+1))) false
      else go(n+1)

    go(0)
  }
}
