name := "Scala for all - property-based testing met ScalaCheck"

version := "1.0"

scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.12.5",
  "org.scalacheck" %% "scalacheck" % "1.17.0",
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
    |  def initJ(intp: scala.tools.nsc.interpreter.IMain) = {
    |    val repl = REPLesent(slideCounter=true, slideTotal=true, input="src/main/repl/wehkamp_jvm_guild.txt", intp=intp)
    |    import repl._
    |    repl
    |  }
    |  def initD(intp: scala.tools.nsc.interpreter.IMain) = {
    |    val repl = REPLesent(slideCounter=true, slideTotal=true, input="src/main/repl/testing_twente.txt", intp=intp)
    |    import repl._
    |    repl
    |  }
    | println("To start presentation:")
    | println("val repl = init($intp); import repl._; f")
    | println("To start lightning talk:")
    | println("val repl = initL($intp); import repl._; f")
    | println("To start JVM Guild talk:")
    | println("val repl = initJ($intp); import repl._; f")
    | println("To start Testing Twente talk:")
    | println("val repl = initD($intp); import repl._; f")
  """.stripMargin
