package CuriosityWeb.model

import spray.json.DefaultJsonProtocol._
import spray.json._

object JsonFormat {

  implicit lazy val studentJsonFormat: RootJsonFormat[Student] = jsonFormat4(Student)
}
