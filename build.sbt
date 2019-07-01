name := "Penguin-lib-test"
organization := "org.ici"
scalaVersion := "2.13.0"

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype Release"  at "https://oss.sonatype.org/content/repositories/releases/",
  "Sonatype Snapshot" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "keyczar"           at "https://raw.githubusercontent.com/google/keyczar/master/java/maven/"
)

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Dependencies.common
  )

import com.scalapenos.sbt.prompt._
val defaultTheme = PromptTheme(List(
  text("[SBT] ", fg(green)),
  text(state => { Project.extract(state).get(organization) + "@" }, fg(magenta)),
  text(state => { Project.extract(state).get(name) },               fg(magenta)),
  text(":", NoStyle),
  gitBranch(clean = fg(green), dirty = fg(yellow)).padLeft("[").padRight("]"),
  text(" > ", NoStyle)
))
promptTheme := defaultTheme
shellPrompt := (implicit state => promptTheme.value.render(state))