import scala.sys.process._
object Git {
  lazy val branch: String = "git branch".lineStream_!
    .find(_.head == '*')
    .map(_.drop(2)).getOrElse("")
  lazy val master: Boolean = branch  == "master"
  lazy val develop: Boolean = branch == "develop"
  lazy val release: Boolean = branch.startsWith("release")
  lazy val hotfix: Boolean = branch.startsWith("hotfix")
  lazy val mode: String = if(master) {
    "prod"
  } else if(release) {
    "acc"
  } else {
    "stg"
  }
}
