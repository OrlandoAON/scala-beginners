package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 34)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

// class parameters are NOT FIELDS, if we add VAL/VAR it becomes a field!
class Person(name:String,val age: Int) {
  val x = 2
  println(x + 1);

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet():Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name:String) = this(name, 0)
  def this() = this("John Doe")

}// every instantiation the body will be evaluated


