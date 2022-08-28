/*
Define an object called calc with a method square that accepts a Double as an argument and... you guessed it... squares its input. Add a method called cube that cubes its input calling square as part of its result calculate.Define an object called calc with a method square that accepts a Double as an argument and... you guessed it... squares its input. Add a method called cube that cubes its input calling square as part of its result calculation.Define an object called calc with a method square that accepts a Double as an argument and... you guessed it... squares its input. Add a method called cube that cubes its input calling square as part of its result calculation.
 */
package lecture2

object calc {
  def square(num: Double): Double = {
    num * num
  }
  def cube (num:Double)  = {
    num * square(num)
  }
  object CalcDemo extends App{
    println(calc.square(2.2))
    println(calc.cube(2.5))

  }
}

