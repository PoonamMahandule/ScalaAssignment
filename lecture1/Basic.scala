package lecture1

object Basics extends App {

    val addition=12.+(42)
    println(addition)

    val int42:Int=42
    println(int42)

    val ifexpress=if(int42>45) 45 else 80
    println(ifexpress)

    val chainedExpress =
      if(int42 > 43) 56
      else if (int42 < 43) 78
      else if(int42 > 43)  89
      else 0

    println(chainedExpress)


    //interpolation

    val interpolatedString=s"the addition is $addition"
    println(interpolatedString)

    def myFunction(x: Int,y:String):String={
      x+" "+y
    }



}
