package lecture3

/*
In this exercise we’re going to write a simulator of my Dad, the movie cri􏰀c. It’s quite simple: any movie directed by Clint Eastwood gets a ra􏰀ng 10.0, any movie directed by John McTiernan gets a 7.0, while any other movie gets a 3.0. Implement an object called Dad with a method rate which accepts a Film and returns a Double. Use pa􏰁ern matching.
 */
object Dad {
  case class Film(name: String, director: String)

  def rate(film: Film): Double = {
    film match {
      case Film(_, "Clint Eastwood") => 10.0
      case Film(_, "John McTiernan") => 7.0
      case _ => 3.0
    }
  }
}
object GetOffMyLawn extends App {
  println(Dad.rate(Dad.Film("Critic", "Clint Eastwood")))
  println(Dad.rate(Dad.Film("Critic", "John McTiernan")))
  println(Dad.rate(Dad.Film("Critic", "abc")))
}
