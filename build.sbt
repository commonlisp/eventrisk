name := "eventrisk"

version := "0.01"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq("rome" % "rome" % "1.0",
		            "org.jsoup" % "jsoup" % "1.6.3",
			    "fr.janalyse" %% "janalyse-series" % "1.6.0" % "compile",
			    "com.typesafe" % "config" % "0.5.0",
			    "org.scala-lang" % "scala-actors" % "2.10.3"
                           )

resolvers += "JAnalyse Repository" at "http://www.janalyse.fr/repository/"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

