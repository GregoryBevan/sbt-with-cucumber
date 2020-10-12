name := "sbt-with-cucumber"
organization := "com.elgregos"

scalaVersion := "2.12.10"

val cucumberVersion = "6.7.0"
val junitVersion = "5.7.0"

resolvers ++= Seq(
  Resolver.jcenterRepo
)

libraryDependencies ++= Seq(
  "org.junit.jupiter"               %  "junit-jupiter"                   % junitVersion     % "it,test",
  "net.aichler"                     %  "jupiter-interface"               % "0.8.3"          % "it,test",
  "io.cucumber"                     %  "cucumber-junit"                  % cucumberVersion  % "it,test",
  "io.cucumber"                     %  "cucumber-java8"                  % cucumberVersion  % "it,test",
  "io.cucumber"                     %  "cucumber-jvm"                    % cucumberVersion  % "it,test",
  "io.cucumber"                     %  "cucumber-junit-platform-engine"  % cucumberVersion  % "it,test",
  "org.assertj"                     %  "assertj-core"                    % "3.14.0"         % "it,test",
)