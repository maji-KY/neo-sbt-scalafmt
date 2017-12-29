description := "Replaces ivy2 resolution for sbt-scalafmt with coursier"

libraryDependencies ++= Seq(
  "io.get-coursier" %% "coursier" % "1.0.0",
  "io.get-coursier" %% "coursier-cache" % "1.0.0"
)

sbtPlugin := true
