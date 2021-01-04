package lectures

object ValuesVariablesTypes extends App {

  // values
  val x: Int = 42
  val y = 42; //compile will infer types;
  print(x);
  // val is immutable
  // x = 2; //Does''t work
  val aString : String = "Hello"; // semi colon is optional since in scale is expected one expression per line.
  val anotherString = "inferString"
  val aBoolean = true;
  val bBoolean : Boolean = false;
  var aChar = 'a';
  var bChar : Char = 'b';
  var aShort : Short = 2111
  var aLong : Long = 3414134141L; //L for long
  var aFloat : Float = 33131.232F
  var aDouble : Double = 1.0; //doesn't neet D because it's default

  //variables
  var z : Int = 4;
  z= 5; // var can assign values, mutable;
}
