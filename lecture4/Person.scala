package lecture4

class Person (val name:String,val age:Int){
  override def toString: String = s"$name, $age";
  def copy(newName: String = name, newage: Int = age): Person = {
    new Person(newName, newage)
  }
//    override def equals(person: Any): Boolean = person match {
//      case person: Person =>
//        this.name == person.name && this.age == person.age
//      case _ => false
//    }
       override def equals(person: Any): Boolean = {
        person match {
  //        case p: Person => (name.equals(p.name) && age.equals(p.age))
          case person: Person => (this.name == person.name)
          case _ => false
        }
    }
    override def hashCode(): Int = {
      //super.hashCode()
      return 31*(this.name.hashCode() + this.age.hashCode())
    }

}

object Person extends App{
    val person2 = new Person("priya",40)
    val person3 = new Person("poonam",30)

    println(person2.toString)
    println(person2.copy("raj",99))
    println("equals methods = "+person2.equals(person2))
}
