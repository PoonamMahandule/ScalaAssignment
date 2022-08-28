package lecture3

/*
Implement a companion object for Person containing an apply method that accepts a whole name as a single string rather than individual first and last names.
Tip: you can split a String into an Array of components as follows:
 */
class Person1(val fName: String, val lName: String) {
  def fullName: String = s"$fName $lName"
}
object Person1 {
  def apply(fullName: String): Person1 = {
    val parts = fullName.split(" ")
    new Person1(parts(0), parts(1))
  }
}
  object PersonDemo extends App {

    println("First name is "+Person1("abc pqr").fName)
    println("last name is "+Person1("abc pqr").lName)
  }


