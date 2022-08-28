package lecture2

object Addition extends App {

  def sum(a: Int, b: Int) = {
    a + b
  }

  val x = sum(10, 20)
  println(x)


  //  val doubler:Int => Int =(v1:Int) => v1*2
  //  println(doubler(5))


  val doubler: Function1[Int, Int] = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }


  //  val square=(a:Int) => a*a
  //  println(square(5))

  val square: Function1[Int, Int] = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * v1
  }

  println(square(8))


  //
  //  val add=(a:Int,b:Int,c:Int,d:Int) => a+b+c+d
  //  println(add(1,2,3,4))

  //  val add: Function5[Int,Int,Int,Int,Int] = new Function5[Int,Int,Int,Int,Int] {
  //    override def apply(v1: Int, v2: Int, v3: Int, v4: Int): Int = v1 + v2 + v3 + v4
  //  }

  val add: Function4[Int, Int, Int, Int, Int] = new Function4[Int, Int, Int, Int, Int] {
    override def apply(v1: Int, v2: Int, v3: Int, v4: Int): Int = v1 + v2 + v3 + v4
  }

  println(add(10, 20, 30, 40))


  def operation(funct: Int => Int): Unit = println("Double value of : " + funct(90))

  operation(doubler)

  val d: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = ???

    override def apply(v1: Int): Int = v1 * 3
  }

}
  //pure function
  //pure fun always return a pure value
  //referential transparency
  //it will not change the value


  //side effects:
  //it gives some error or exceptions
  //not referentially transparent

  //first class function
  //we can pass this function as variable


  //Higher order function
  //it takes another function as input


  //Partial function
  //which will handle only certain inputs
  //o.w it will not give o/p


  //Pattern Matching
  //it evaluates the expression,if matches with the case,the expression for that case evaluates the value

















