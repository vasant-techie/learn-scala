package exceptions

import scala.io.StdIn

/**
 * This is the task in Udemy's Scala course.
 * The task objective is to convert the input Kilometer into Miles, by multiplying the input Km value with 0.62.
 */
@main
def convertKmToMiles(): Unit = {
  val kmToMilesVal = 0.62

  val kmVal = StdIn.readLine("Please enter the Kilo meter (Km) Value: ")
  val milesVal = kmVal.toDouble * kmToMilesVal
  println(s"The miles travelled by you is: $milesVal")
}
