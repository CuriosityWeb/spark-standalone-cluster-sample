package CuriosityWeb

import CuriosityWeb.AppConfig._
import CuriosityWeb.model.Student
import org.apache.spark.sql.SparkSession

object FirstRun extends App {

  val spark = SparkSession
    .builder()
    .appName(getClass.getSimpleName)
    .config(sparkSimpleConfig)
    .getOrCreate()

  val input = List.tabulate(20)(_ + 1).map(in => Student(s"Id-$in", s"FirstName-$in", s"LastName-$in", in))

  import spark.implicits._

  val dataset = input.toDS()

  dataset.show()

  val newDataSet = dataset.where("rollNumber > 5")

  newDataSet.show()

  spark.close()
}
