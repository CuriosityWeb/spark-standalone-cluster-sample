ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "com.github.CuriosityWeb"

lazy val root = (project in file("."))
  .settings(name := "scala-examples")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.3.0",
  "com.typesafe" % "config" % "1.4.2",
  "io.spray" %% "spray-json" % "1.3.6")
