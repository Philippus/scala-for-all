name := "Scala for all - property-based testing met ScalaCheck"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.7",
  "org.scalacheck" %% "scalacheck" % "1.13.5",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

initialCommands in console :=
  """  def init(intp: scala.tools.nsc.interpreter.IMain) = {
    |    val repl = REPLesent(slideCounter=true, slideTotal=true, input="src/main/repl/exception_twente.txt", intp=intp)
    |    import repl._
    |    repl
    |  }
    |  def initL(intp: scala.tools.nsc.interpreter.IMain) = {
    |    val repl = REPLesent(slideCounter=true, slideTotal=true, input="src/main/repl/wehkamp_lightning.txt", intp=intp)
    |    import repl._
    |    repl
    |  }
    |
    | println("To start presentation:")
    | println("val repl = init($intp); import repl._; f")
    | println("To start lightning talk:")
    | println("val repl = initL($intp); import repl._; f")
  """.stripMargin
