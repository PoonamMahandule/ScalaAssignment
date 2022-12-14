/*
Create an object called divide with an apply method that accepts two Ints and returns DivisionResult. DivisionResult should be a sealed trait with two subtypes: a Finite type encapsula􏰀ng the result of a valid division, and an Infinite type represen􏰀ng the result of dividing by 0.
Here’s some example usage:
val x = divide(1, 2)
// x: DivisionResult = Finite(0)
val y = divide(1, 0)
// y: DivisionResult = Infinite
 */
package lecture4

sealed trait DivisionResult
final case class Finite( value:Int) extends DivisionResult
case object Infinite extends DivisionResult
object divide {
  def apply(num: Int, den: Int): DivisionResult =
    if(den == 0) Infinite else Finite(num/den)

//  divide match {
//    case Finite(num,den) => s"It's finite: ${num /den}"
//    case Infinite => s"It's infinite"
//  }
  divide(1,0) match {
    case Finite(value) => s"It's finite: ${value}"
    case Infinite => s"It's infinite"
  }

  def main(args: Array[String]): Unit = {
    println(divide(7,2))
    println(divide(7,0))
    println(divide(1,2))
    println(divide(1,0))
  }
  }

