/*
Augment the Counter from the previous exercise to allow the user can optionally pass an Int parameter to inc and dec. If the parameter is omi􏰁ed it should default to 1.
 */
package lecture3
class Counter(val num: Int) {
  def dec(amount: Int = 1) = new Counter(num - amount)
  def inc(amount: Int = 1) = new Counter(num + amount)

  def adjust(adder: Adder) =
    new Counter(adder.add(num))
}
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

object CountingFaster extends App {

  val result = new Counter(10).inc(1).inc()
  println(result.num)

  val adder = new Adder(2)
  val counter = new Counter(10)
  println(counter.adjust(adder))

}
