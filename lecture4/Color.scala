/*
Write a sealed trait Color to make our shapes more interest􏰀ng.
• give Color three proper􏰀es for its RGB values;
• create three predefined colours:Red,Yellow,and Pink;
• provide a means for people to produce their own custom Colors with their own RGB values;
•provide a means for people to tell whether any Color is “light” or “dark”.
A lot of this exercise is le􏰃 deliberately open to interpret􏰀on. The important thing is to prac􏰀ce working with traits, classes, and objects.
Decisions such as how to model colours and what is considered a light or dark colour can either be le􏰃 up to you or discussed with other class members.
Edit the code for Shape and its subtypes to add a colour to each shape.
 */
package lecture4

sealed trait Color {
  val red: Double
  val green: Double
  val blue: Double
  def isLight = (red + green + blue) / 3.0 > 0.5
  def isDark = (red + green + blue) / 3.0 < 0.5
}

case object Red extends Color {
  val red = 1.0
  val green = 0.0
  val blue = 0.0
}
case object Yellow extends Color {
  val red = 1.0
  val green = 1.0
  val blue = 0.0
}
case object Pink extends Color {
  val red = 1.0
  val green = 0.0
  val blue = 1.0
}
final case class CustomColor(red: Double, green: Double, blue: Double) extends Color
//{
//  def apply():String => if (red + green + blue / 3.0 > 0.5) "isLight" else "isDark"
//}
sealed trait Shape4{
  val sides :Int
  def perimeter: Double
  def area: Double
}
sealed trait Rectangular3{
  val sides:Int= 4
}

case class Circle3(radius:Double,color: Color) extends Shape4  {
  override val sides: Int = 0;
  override def perimeter:Double = 2 * math.Pi * radius
  override def area :Double = math.Pi * radius * radius
}
case class Rectangle3(length:Double, width:Double,color: Color) extends Shape4 with Rectangular3 {
  //  override val sides: Int = 4
  override def perimeter: Double = 2 * (length * width)
  override def area: Double = length * width
}
case class Square3(side :Double,color: Color) extends Shape4 with Rectangular3{
  //  override val sides : Int = 4
  override def perimeter: Double = 4 * side
  override def area: Double = side * side
}
object Draw{
  def apply(shape4:Shape4):String= {
    shape4 match {
      case Circle3(radius, color) => s"${color} color circle has radius ${radius} cm"
      case Rectangle3(length, width, color) => s"${color} color rectangle has length ${length}cm and width ${width}cm"
      case Square3(side, color) => s"${color} color square has side ${side}cm"
    }
  }
    def apply(color: Color): String = color match {
      case Yellow => "yellow"
      case Pink => "pink"
      case Red => "Red"
      case color => if(color.isLight) "light" else "dark"
    }


}
object ShapeDemo4 extends App{
  println(Draw(Circle3(10,Red)))
  println(Draw(Square3(12.10,CustomColor(1.0,0.2,0.1))))
}




