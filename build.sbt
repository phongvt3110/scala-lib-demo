name := "UnitTestScala"
organization := "org.ici"
scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Dependencies.common
  )