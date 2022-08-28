
/*
Define an object called person that contains fields called firstName and lastName. Define a second object called alien containing a method called greet that takes your person as a parameter and returns a greeting using their firstName.
 */
package lecture2
object GreetingHuman extends App{

object Person {
  val firstName: String = "Poonam"
  val lastName: String = "Mahandule"
}
  object Alien {
    def greet (person:Person.type ) :String =
     "Greetings "+ person.firstName
  }
  println(Alien.greet(Person))
}
