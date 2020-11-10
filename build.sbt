name := "sbt-with-cucumber"
organization := "com.elgregos"

scalaVersion := "2.12.10"

val cucumberVersion = "6.7.0"
val junitVersion = "5.7.0"

resolvers ++= Seq(
  Resolver.jcenterRepo
)

libraryDependencies ++= Seq(
  "org.junit.jupiter"               %  "junit-jupiter"                   % junitVersion     % "test",
  "org.junit.vintage"               %  "junit-vintage-engine"            % junitVersion     % "test",
  "net.aichler"                     %  "jupiter-interface"               % "0.8.3"          % "test",
  "io.cucumber"                     %  "cucumber-junit"                  % cucumberVersion  % "test",
  "io.cucumber"                     %  "cucumber-java8"                  % cucumberVersion  % "test",
  "io.cucumber"                     %  "cucumber-jvm"                    % cucumberVersion  % "test",
  "org.assertj"                     %  "assertj-core"                    % "3.14.0"         % "test",
  "com.github.cukedoctor"           % "cukedoctor-main"                  % "3.3"            % "test",
)