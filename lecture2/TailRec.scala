package lecture2

import scala.io.StdIn.readLine

object TailRec extends App {
  val flag=true
  while(flag) {
    println("Enter Message : ")
    println(chatting(readLine()))
  }
  def chatting(msg: String) =
    msg match {
      case "Hi" => "Hi everyone !!!"
      case "Hello" => "hello"
      case "Welcome" => "Welcome to springer Nature"
      case _ => System.exit(0)

    }

}
