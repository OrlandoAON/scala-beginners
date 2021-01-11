package lectures.part1basics

import scala.math.sqrt

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(a: String, b: Int): String = {
    if (b == 1) a
    else a + aRepeatedFunction(a, b - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  //Function language when we need LOOPS, we use recursion. do not use imperative code (while loop)

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old
  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(greeting("Orlando", 34))

  //2. Factorial Functional 1*2*3*...*n
  def factorial(n: Int): Int = {
    if (n <= 0)
      1
    else
      n * factorial(n - 1)
  }

  println(factorial(5))

  //3. fibonacci function
  // f(1)=1
  // f(2)=1
  // f(n)=f(n-1) + f(n-2)

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2)
      1
    else {
      println("Computing - First I need Fibonacci of " + (n - 1) + " and Fibonacci of " + (n - 2))
      val result = fibonacci(n - 1) + fibonacci(n - 2)
      println("computed factorial of " + n + ": " + result)
      result
    }
  }

  println(fibonacci(6))

  //4. Tests if a number is prime

  def isPrime(n: Int): Boolean = {
    def innerIsPrime(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && innerIsPrime(t - 1)
    }

    innerIsPrime(sqrt(n).toInt)
  }

  /* println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))*/

}
