package lecture4

trait Light

case object Red1 extends Light
case object Yellow1 extends Light
case object Green1 extends Light

object singleLight extends App {
  def trafficLights(light: Light):Light = {
    light match{
      case Red1  =>  Yellow1
      case Yellow1 => Green1
      case Green1 => Red1
    }
  }
  println(trafficLights(Green1))
  println(trafficLights(Yellow1))

}