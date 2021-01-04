package lectures

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(a: String, b: Int): String = {
    if (b == 1) a
    else a + aRepeatedFunction(a, b-1)
  }

  println(aRepeatedFunction("Hello", 3))

  //Function language when we need LOOPS, we use recursion. do not use imperative code (while loop)

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n : Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }

  
}
