package lectures

object CBNvsCBV extends  App {

  def calledByValue (x:Long):Unit = {
    println("Called by value:  "+ x);
    println("Called by value:  "+ x);
  }

  def calledByName (x: => Long):Unit = {
    println("Called by name:  "+ x); // the parameter is evaluated EACH time it's called, the parameter is also LAZY,...
    println("Called by name:  "+ x);//... meaning that it'' only evaluated once it''' called
  }

  calledByValue(System.nanoTime());
  calledByValue(System.nanoTime());
  calledByName(System.nanoTime())
  calledByName(System.nanoTime())
}
