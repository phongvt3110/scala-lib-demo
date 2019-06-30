import sbt._
object Dependencies {
  val libVersion = if(Git.master || Git.release){"1.0.0"} else {"1.0.0-SNAPSHOT"}
  val common = Seq(
    "com.github.phongvt3110" % "java-ici-lib" % "1.0.5"
  )
}
