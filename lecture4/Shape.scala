/*
Define a trait called Shape and give it three abstract methods:
• sides returns the number of sides;
• perimeter returns the total length of the sides; • area returns the area.
Implement Shape with three classes: Circle, Rectangle, and Square. In each case provide implementa􏰀ons of each of the three methods. Ensure that the main constructor parameters of each shape (e.g. the radius of the circle) are accessible as fields.
Tip: The value of π is accessible as math.Pi.
 */
package lecture4

trait Shape {
  val sides: Int
  def perimeter: Double
  def area: Double
}
//trait Radius{
//  def r:Int
//}
case class Circle(radius:Double) extends Shape  {
  override val sides: Int = 0;
  override def perimeter:Double = 2 * math.Pi * radius
  override def area :Double = math.Pi * radius * radius
}
case class Rectangle(lenght:Double,width:Double) extends Shape{
  override val sides: Int = 4
  override def perimeter: Double = 2 * (lenght * width)
  override def area: Double = lenght * width
}
case class Square(side :Double) extends Shape{
  override val sides: Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}
object ShapeDemo2 extends App{
  val circle = Circle(20.0)
  println("side of circle is = "+ circle.sides)
  println("Area of circle is = " + circle.area)
  println("Perimeter of circle is = "+circle.perimeter)
  val rectangle = Rectangle(10.34,12.89)
  println("Side of rectangle is = " +rectangle.sides)
  println("Area of rectangle is = " + rectangle.area)
  println("Perimeter of rectangle is = " + rectangle.perimeter)
  val square = Square(12.0)
  println("Side of a square is " + square.side)
  println("Area of Square is " + square.area)
  println("perimeter of square is "+ square.perimeter)
}
