package lecture2

object OrderOfEvaluation extends App{
  object argh {
    def a = {
      println("a")
      1
    }
    val b = {
      println("b")
      a + 2
    }
    val d = {
      println("d")
      a + 2
    }
    def c = {
      println("c")
      a
      b + "c"
    }
  }
  println(argh.a + argh.b + argh.c)

}
//When the object is first loaded, Scala runs through its definitions and calculates the values of each of its fields.
//The body expression of a field is run only once after which the final value is stored in the object. The expression is never evaluated again
//