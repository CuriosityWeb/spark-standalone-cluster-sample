package CuriosityWeb.model

final case class Student(id: String, fName: String, lName: String, rollNumber: Int) {

  def fullName: String = s"$fName $lName"
}
