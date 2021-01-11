package lectures

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  // all java functions
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  //scala
  val numStr = "45"
  val number = numStr.toString
  println('a' +: numStr :+ 'z' )
  println('a' + numStr + 'z' )

  println(str.reverse)
  println(str.take(5))

  //S-Interpolator
  val name = "Orlando"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning  ${age +1} years old"
  println(anotherGreeting)

  //F-Interpolator
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")




}