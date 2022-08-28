/*
Reimplement Counter as a case class, using copy where appropriate. Addi- 􏰀onally ini􏰀alise count to a default value of 0.
 */
package lecture3

object CaseClassCounter extends App {
  case class Counter(count: Int = 0) {
    def dec = copy(count = count - 1)

    def inc = copy(count = count + 1)
  }

  println(Counter().inc.count)
  println(Counter().dec.count)

}
