enablePlugins(ScalaJSPlugin)

scalaJSModuleKind := ModuleKind.CommonJSModule

name := "slinky-native-example"

scalaVersion := "2.12.4"

libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.2.0"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full)
