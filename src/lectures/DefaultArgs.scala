package lectures

object DefaultArgs extends App {

  def trFact(n:Int, acc: Int = 1 ): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  var fact10 = trFact(10)

  def savePicture (format: String = "jpg", width: Int = 1920, height: Int = 1080):Unit = println("saving picture")
  savePicture(width = 800); // name the parameter since all has default values
  savePicture(height = 600, format = "bitmap", width = 800); //named can be in any order

}
