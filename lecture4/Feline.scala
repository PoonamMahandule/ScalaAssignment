/*
Define a trait Feline and then define all the different species as subtypes of Feline. To make things interes􏰀ng, define:
• on Feline a colour as before;
• on Feline a String sound,which for a cat is "meow" and is"roar"
for all other felines;
• only Cat has a favourite food; and
• Lions have an Int maneSize.

 */
package lecture4

trait Feline {
  def colour: String
  def sound: String
}
case class Cat(colour: String,sound:String = "memw",food: String) extends Feline
case class Lion(colour: String,sound:String = "roar",maneSize:Int) extends Feline
case class Tigers(colour: String,sound:String = "roar") extends Feline
case class Panthers(colour: String,sound:String = "roar") extends Feline




