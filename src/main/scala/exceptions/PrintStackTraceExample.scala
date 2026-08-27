package exceptions

import scala.io.StdIn

/***
 * This is an experimental code to analyze how the Stack Trace gets printed even after the
 * last line of this program. It seems, there is Concurrency involved in Exception Handling.
 */
@main
def printStackTraceExample(): Unit = {
  val in = StdIn.readLine()
  try {
    val inVal = in.toInt
  } catch {
    case e: IllegalStateException => e.printStackTrace()
    case e: NumberFormatException => println(s"This is Number Format Exception")
      println(e.printStackTrace())
    case e: Exception => e.printStackTrace()
  }
  println(in)
}
