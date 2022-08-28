
/*
Q1)Write two classes, Director and Film, with fields and methods as follows: • Director should contain:
– a field firstName of type String
– a field last Name of type String
– a field year Of Birth of type Int
– a method called name that accepts no parameters and returns the
full name
• Film should contain:
– a field name of type String
– a field year Of Release of type Int – a field imdb Rating of type Double – a field director of type Director
– a method directors Age that returns the age of the director at the time of release
– a method is Directed By that accepts a Director as a parameter and returns a Boolean

Q2)
Implement a method of Film called copy. This method should accept the same parameters as the constructor and create a new copy of the film. Give each parameter a default value so you can copy a film changing any subset of its values:

 */
package lecture3

object DirectorialDebut extends App{
  class Director(val firstName:String,val lastName:String,val yearOfBirth:Int){
    def name():String = {
    firstName + " " + lastName
    }
  }

    val dir = new Director("poonam","mahandule",1999)
    println(dir.name())
    val dir2 = new Director("Priya","Patil",1995)
    println(dir.name())

   class Film(val name:String,val yearOfRelease:Int,val imdbRating:Double,val director:Director){
     def directorsAge():Int={
       yearOfRelease - director.yearOfBirth
     }
     def isDirectedBy(dir:Director):Boolean = {
      if( dir.firstName == "poonam")
        true
      else
        false
     }
     def copy(name: String = this.name,yearOfRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating, director: Director = this.director): Film =
       new Film(name, yearOfRelease, imdbRating, director)

     def copy2(name: String ,yearOfRelease: Int , imdbRating: Double , director: Director ): Film =
       new Film(name, yearOfRelease, imdbRating, director)



   }
  val film= new Film("Mother India",2022,4.2,dir)
 println( film.directorsAge())
  println(film.isDirectedBy(dir))
  val film2= new Film("Mother India",2022,4.2,dir2)
  println( film2.directorsAge())
  println(film2.isDirectedBy(dir2))

  println(film.copy2("High Plains Drifter", 1973, 7.7,dir2).name)
  println(film.name)


}
