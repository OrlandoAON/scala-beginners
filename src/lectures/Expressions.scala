package lectures

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
 // + - / * & | ^ << >> >>> (scala only: right shift with zero extension)

  println(1 == x)
 // == != > >= < <=

  println(!(1 == x))
  // ! || &&

  var aVariable = 2
  aVariable +=3 // -=, =, *=,/= side effects
  println(aVariable)

  // Instructions (tell computer to DO - similar to java) vs Expressions (VALUE) computing language

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // if expression and NOT if instruction
  println(aConditionedValue)
  var i = 0
  while ( i < 10) {
    println(i)
    i+=1
  }

  // NEVER WRITE THIS WHILE IN SCALA AGAIN. this is imperative programming like in Java/Python, not mostly used in computing programming
  // EVERYTHING in scale is a expression

  val aWeirdValue = (aVariable = 3)// Unit type, equivalent to void in Java
  println(aWeirdValue) // return () unique value returned by unit

  val aWhile = while ( i < 10) { // REMEMBER everything in scale is a expression
    println(i)
    i+=1
  }
  println(aWhile) // return () unique value returned by unit

  //side effects : expressions returning Units (imperative programing instructions that returns Unit in Scala: println(); whiles; reassigning

// code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1;
    if (z > 2) "hello" else "goodbye" // the result of the block is the result of the last expression, so it's string

    // 1. Difference between "hello world" vs println ("hello world")
    // "hello world" => literal string value
    // println ("hello world") expression (returns Unit) that has de side effect of printing hello word on the console

    val someValue = {
      2 < 3
    }
    println(someValue)

    var someOtherValue = {
      if (someValue) 239 else 456 // since the code blocks returning type is the last expression, this line is ignored.
      42
    }
    println(someOtherValue)

// NEVER WRITE WHILE in SCALA AGAIN =)

  }



}
