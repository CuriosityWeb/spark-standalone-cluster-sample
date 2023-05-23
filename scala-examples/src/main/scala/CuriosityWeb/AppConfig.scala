package CuriosityWeb

import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark.SparkConf

import java.net.InetAddress
import scala.util.Try

object AppConfig {

  lazy val config: Config = ConfigFactory.load()

  lazy val sparkSimpleConfig: SparkConf = new SparkConf {
    setMaster(config.getString("spark-master-url"))
    set("spark.driver.host", Try(config.getString("spark-driver-host"))
      .toOption.filter(_.trim.nonEmpty).getOrElse(InetAddress.getLocalHost.getHostAddress))
    set("spark.driver.port", config.getString("spark-driver-port"))
  }
}
