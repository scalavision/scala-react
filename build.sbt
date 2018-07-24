name := "ScalaReact"

scalaVersion := "2.12.6"

version := "0.1-SNAPSHOT"

//autoCompilerPlugins := true

val continuationsVersion = "1.0.3"

autoCompilerPlugins := true

addCompilerPlugin("org.scala-lang.plugins" % "scala-continuations-plugin_2.12.2" % continuationsVersion)

libraryDependencies += "org.scala-lang.plugins" %% "scala-continuations-library" % continuationsVersion

scalacOptions += "-P:continuations:enable"

