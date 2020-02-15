name := """play-playground"""
organization := "9renpoto"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  evolutions,
  jdbc,
  guice,
  "io.sentry" % "sentry-logback" % "1.7.30",
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3",
  "org.postgresql" % "postgresql" % "42.2.10",
  "org.scalikejdbc" %% "scalikejdbc" % "3.4.0",
  "org.scalikejdbc" %% "scalikejdbc-config" % "3.4.0",
  "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.6.0-scalikejdbc-3.3",
  "org.scalikejdbc" %% "scalikejdbc-play-fixture" % "2.8.0-scalikejdbc-3.4"
)

coverageEnabled := true

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "9renpoto.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "9renpoto.binders._"