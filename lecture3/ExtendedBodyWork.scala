package lecture3

/*

Write companion objects for Director and Film as follows:
• the Director companion object should contain:
– Un
anapply method that accepts the same parameter asthecon- structor of the class and returns a new Director;
– a method older that accepts two Directors and returns the oldest of the two.
 */
object ExtendedBodyWork extends App {
  class Director(val firstName: String, val lastName: String, val yearOfBirth: Int)

  object Director {
    def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
      new Director(firstName, lastName, yearOfBirth)

    def older(director1: Director, director2: Director): Director =
      if (director1.yearOfBirth < director2.yearOfBirth) director1
      else
        director2
  }

  class Film(val name: String, val yearOfRelease: Int, val rating: Double, val director: Director)

  object Film {
    def apply(name: String, yearOfRelease: Int, rating: Double, director: Director): Film =
      new Film(name, yearOfRelease, rating, director)


    def highestRating(film1: Film, film2: Film): Double =
      if (film1.rating >= film2.rating) film1.rating
      else film2.rating

    def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
      if (film1.director.yearOfBirth > film2.director.yearOfBirth) film2.director
      else film1.director

  }


}
