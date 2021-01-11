package lectures.part1basics

import scala.annotation.tailrec
import scala.math.sqrt

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 0)
      1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1) // since it calls the function it STACKS the calls so it consumes a lot of memory
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10));

  //println(factorial(5000)); //StackOverflowError around 534 - memory usage at the limit

  def anotherFactorial(n: Int): BigInt = {
    @tailrec // compiler will tell if it is indeed tail recursive
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) //TAIL RECURSION = use the recursive call as the LAST expression
    }

    factorialHelper(n, 1)
    // WHEN WE NEED LOOPS, USE TAIL RECURSION!
  }

  /*
  anotherFactorial(10) = factorialHelper(10,1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper(8, 9 * 10 * 1)
  = factorialHelper(7,8 * 9 * 10 * 1)
  =...
  = factorialHelper(2,3 * 4 * ... * 8 * 9 * 10 * 1)
  = factorialHelper(1,1 * 2 * 3 * 4 * ... * 8 * 9 * 10 * 1)
  = 1 * 2 * 3 * 4 * ... 8 * 9 * 10
   */

  println(anotherFactorial(5000))

  /* using tail recursive
  1. concatenate a string n times
  2. IsPrime function
  3. Fibonacci function
   */

  def concatStringTailRec(word: String, x: Int): String = {
    @tailrec
    def innerConcatStringTailRec(word: String, x: Int, accumulator: String): String = {
      if (x <= 0) accumulator
      else innerConcatStringTailRec(word, x - 1, word + accumulator)
    }

    innerConcatStringTailRec(word, x, "")
  }

  println(concatStringTailRec("Hello", 3))

  def isPrimeTailRec(number: Int): Boolean = {
    @tailrec
    def innerIsPrimeTailRec(x: Int, isNotPrimeAccumulator: Boolean): Boolean = {
      if ((isNotPrimeAccumulator)) false
      else if (x <= 1) true
      else innerIsPrimeTailRec(x - 1, x - 1 > 1 && number % (x - 1) == 0)
    }

    innerIsPrimeTailRec(number, false)
  }

  println(isPrimeTailRec(11))

  def isPrimeProfessorResult(n: Int): Boolean = {
    @tailrec
    def innerIsPrimeProfessorResult(t: Double, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (n <= 1) true
      else innerIsPrimeProfessorResult(n - 1, n % t != 0 && isStillPrime)
    }

    innerIsPrimeProfessorResult(sqrt(n), true)
  }

  print(isPrimeProfessorResult(2003))

  def fibonacciTailRec(number: Int): BigInt = {
    def innerFibonacciTailRec(i: Int, last: Int, nextToLast: Int): BigInt = {
      if (i >= number) last
      else innerFibonacciTailRec(i + 1, last + nextToLast, last)
    }

    if (number <= 2) 1
    else innerFibonacciTailRec(2, 1, 1)
  }

}
