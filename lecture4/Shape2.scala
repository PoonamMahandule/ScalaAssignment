/*
The solu􏰀on from the last exercise delivered three dis􏰀nct types of shape. However, it doesn’t model the rela􏰀onships between the three correctly. A Square isn’t just a Shape—it’s also a type of Rectangle where the width and height are the same.
Refactor the solu􏰀on to the last exercise so that Square and Rectangle are subtypes of a common type Rectangular.
Tip: A trait can extend another trait.
 */
package lecture4

trait Shape2 {
  val sides :Int
  def perimeter: Double
  def area: Double
}
trait Rectangular{
  val sides:Int= 4

}
//trait Radius{
//  def r:Int
//}
case class Circle1(radius:Double) extends Shape2  {
  override val sides: Int = 0;
  override def perimeter:Double = 2 * math.Pi * radius
  override def area :Double = math.Pi * radius * radius
}
case class Rectangle1(length:Double, width:Double) extends Shape2 with Rectangular {
//  override val sides: Int = 4
  override def perimeter: Double = 2 * (length * width)
  override def area: Double = length * width
}
case class Square1(side :Double) extends Shape2 with Rectangular {
//  override val sides : Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}
object ShapeDemo extends App{
  val circle1 = Circle1(20.0)
  println("side of circle is = "+ circle1.sides)
  println("Area of circle is = " + circle1.area)
  println("Perimeter of circle is = "+circle1.perimeter)
  val rectangle1 = Rectangle1(10.34,12.89)
  println("Side of rectangle is = " +rectangle1.sides)
  println("Area of rectangle is = " + rectangle1.area)
  println("Perimeter of rectangle is = " + rectangle1.perimeter)
  val square1 = Square1(12.0)
  println("Side of a square is " + square1.sides)
  println("Area of Square is " + square1.area)
  println("perimeter of square is "+ square1.perimeter)
}

