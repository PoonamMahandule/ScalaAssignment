package lecture3

case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}
object Person extends App {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    apply(parts(0), parts(1))
  }
}
