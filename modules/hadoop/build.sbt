import Dependencies.Version._

crossScalaVersions := Seq(scala212, scala213)

libraryDependencies ++= Seq("org.apache.hadoop" % "hadoop-common" % "3.3.5" % "provided")
mdocLibraryDependencies ++= Seq("org.apache.hadoop" % "hadoop-common" % "3.3.5")

developers := List(Developer("lmnet", "Yuriy Badalyantc", "lmnet89@gmail.com", url("https://github.com/lmnet")))
