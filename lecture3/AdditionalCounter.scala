/*
Extend Counter to add a method called adjust. This method should accept an Adder and return a new Counter with the result of applying the Adder to the count.
 */
package lecture3

object AdditionalCounter extends App {
  class Adder(amount: Int) {
    //def add(in: Int) = in + amount
    def apply(in: Int) = in + amount
  }

  def adjust(adder: Adder) = {
    //new Adder(adder.add(in = 100))
    new Adder(adder(1000))
  }

  val value = new Adder((1000))
  //value.apply(45)
  println(value(45))
}
