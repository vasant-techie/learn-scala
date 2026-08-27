package exceptions

import scala.io.StdIn

/**
 * This is an AI generated code, an alternative to my previous code snippet committed to GitHub.
 */
@main
def handleException(): Unit =
  val multiplierVal = 50
  val in = Option(StdIn.readLine("Please enter a value: ")).getOrElse("")
  println(s"The given input value is $in")

  in.toIntOption match
    case Some(inVal) =>
      println(s"The entered value multiplied by $multiplierVal is: ${inVal * multiplierVal}")
      println("Hoorey! Welcome to the Scala Ulagam!")
    case None =>
      Console.err.println("Please enter only integer value!")
      sys.exit(1)