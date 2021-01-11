package lectures

object DefaultArgs extends App {

  def trFact(n:Int, acc: Int = 1 ): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  var fact10 = trFact(10)

}
