package exceptions

import scala.io.StdIn

@main
def handleException(): Unit = {
  val multiplierVal = 50
  val in = StdIn.readLine("Please enter a value: ")
  println(s"The given input value is $in")
  try {
    val inVal = in.toInt
    println(s"The entered value multiplied by $multiplierVal is: ${inVal * multiplierVal}")
  } catch {
    case e: NumberFormatException => Console.err.println("Please enter only integer value!")
      throw e
  }
  println("Hoorey! Welcome to the Scala Ulagam!")
}