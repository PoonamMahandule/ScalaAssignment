package lecture3

/*
  Recall the cats from a previous exercise:
  Define a class Cat and then create an object for each cat in the table above.
  */
class Cat(val name:String,val color:String,val food:String)
object CatDemo extends App{
  val cat1= new Cat("Oswald","Black","Milk")
  val cat2= new Cat("Henderson","Ginger","Chips")
  val cat3= new Cat("Quentin","Tabby and white","Curry")
  println(cat1.name)

}
