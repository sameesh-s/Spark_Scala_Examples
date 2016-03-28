name := "firstapp"
version := "0.0.1"
scalaVersion := "2.11.7"
// additional libraries
libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.6.1" % "provided"
)
