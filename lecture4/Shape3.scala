/*
Let’s revisit the Shapes example from Sec􏰀on [@sec:traits:shaping-up-2].
First make Shape a sealed trait. Then write a singleton object called Draw with an apply method that takes a Shape as an argument and returns a descrip􏰀on of it on the console. For example:
Draw(Circle(10))
// res1: String = A circle of radius 10.0cm
Draw(Rectangle(3, 4))
// res2: String = A rectangle of width 3.0cm and height 4.0cm
 */
package lecture4


sealed trait Shape3{
  val sides :Int
  def perimeter: Double
  def area: Double
}
sealed trait Rectangular1{
  val sides:Int= 4
}

case class Circle2(radius:Double) extends Shape3  {
  override val sides: Int = 0;
  override def perimeter:Double = 2 * math.Pi * radius
  override def area :Double = math.Pi * radius * radius
}
case class Rectangle2(length:Double, width:Double) extends Shape3 with Rectangular1 {
  //  override val sides: Int = 4
  override def perimeter: Double = 2 * (length * width)
  override def area: Double = length * width
}
case class Square2(side :Double) extends Shape3 with Rectangular1 {
  //  override val sides : Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}
object Draw1{
  def apply(shape3:Shape3):String={
    shape3 match {
      case Circle2(radius) => s"Circle has radius ${radius} cm"
      case Rectangle2(length,width) => s"Rectangle has length ${length}cm and width ${width}cm"
      case Square2(side) => s"Square has side ${side}cm"
    }

  }
}
object ShapeDemo3 extends App{
//  val circle2 = Circle2(20.0)
//  println("side of circle is = "+ circle2.sides)
//  println("Area of circle is = " + circle2.area)
//  println("Perimeter of circle is = "+circle2.perimeter)
//  val rectangle2 = Rectangle2(10.34,12.89)
//  println("Side of rectangle is = " +rectangle2.sides)
//  println("Area of rectangle is = " + rectangle2.area)
//  println("Perimeter of rectangle is = " + rectangle2.perimeter)
//  val square2= Square2(12.0)
//  println("Side of a square is " + square2.sides)
//  println("Area of Square is " + square2.area)
//  println("perimeter of square is "+ square2.perimeter)
  println(Draw1(Circle2(10)))
}



