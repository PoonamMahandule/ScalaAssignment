/*
Copy and paste calc from the previous exercise to create a calc2 that is generalized to work with Ints as well as Doubles. If you have Java experience, this should be fairly straigh􏰅orward. If not, read the solu􏰀on below.
 */
package lecture2

object calc2 {
  def square(num: Double): Double = num * num
  def cube (num:Double) = num * square(num)
  def square(num: Int): Int = num * num
  def cube (num:Int):Int  = num * square(num)
}

object Calc2Demo extends App {
  println(calc2.square(2.2))
  println(calc2.cube(2.5))
  println(calc2.square(8))
  println(calc2.cube(4))

}

