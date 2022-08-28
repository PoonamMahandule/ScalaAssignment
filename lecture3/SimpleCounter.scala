package lecture3

/*
Implement a Counter class. The constructor should take an Int. The meth- ods inc and dec should increment and decrement the counter respec􏰀vely returning a new Counter. Here’s an example of the usage:
 */
object simpleCounter extends App{

  class Counter(val num:Int){
    def inc () =new Counter(num + 1)
    def dec () =new Counter( num - 1)
    //   def inc1() = num+1;
    //    def dec1() = num-1;
  }

  val result =new Counter (10).inc().dec().dec()
  //   val result2 = new Counter (num = 2).inc1().dec1();
  // println(result2);
  println(result.num)
}

/*
inc and dec return a new Counter bcoz
val fields are immutable
Methods that return new Counter objects give us a way of returning new state without the side-effects of assignment. They also permit method chaining, allowing us to write whole sequences of updates in a single expression
 */


