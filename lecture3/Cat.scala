/*
Define an object ChipShop with a method willServe. This method should accept a Cat and return true if the cat’s favourite food is chips, and false otherwise.
 */
package lecture3

case class Cat1( color: String, food:String){
  def willServe(cat :Cat1):Boolean = {
    cat match {
      case Cat1(_,"chips") => true
      case Cat1(_,_) => false
    }
  }
}
object ChipShop extends App {
  val cats=Cat1("white","chips")
  val cats2=Cat1("Brown","Chocolates")
  println(cats.willServe(cats))
  println(cats2.willServe(cats2))
}




