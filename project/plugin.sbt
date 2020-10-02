resolvers += Resolver.jcenterRepo

addSbtPlugin("net.aichler" % "sbt-jupiter-interface" % "0.8.3")

val junitVersion = "5.7.0"
dependencyOverrides ++= Seq(
  "org.junit.jupiter" % "junit-jupiter-api" % junitVersion,
  "org.junit.jupiter" % "junit-jupiter-engine" % junitVersion,
  "org.junit.platform" % "junit-platform-launcher" % "1.7.0"
)