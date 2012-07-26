name := "eventrisk"

version := "0.01"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq("rome" % "rome" % "1.0",
		            "org.jsoup" % "jsoup" % "1.6.3",
			    "fr.janalyse" %% "janalyse-series" % "1.1.1" % "compile",
			    "com.typesafe" % "config" % "0.5.0"
                           )

resolvers += "JAnalyse Repository" at "http://www.janalyse.fr/repository/"

