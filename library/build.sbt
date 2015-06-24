organization := "com.meituan.firefly"

name := "library"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

libraryDependencies += "org.assertj" % "assertj-core" % "2.1.0" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.5.8" % Test
    