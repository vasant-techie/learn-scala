package exceptions

import scala.io.StdIn

@main
def withThrowExceptions(): Unit = {
  print("Please enter Integer number: ")
  var in: Option[Int] = None
  throw IllegalStateException() //this is equivalent to "throw new IllegalStateException()"
  try {
    in = Some(StdIn.readInt())
  } catch {
    case e: Exception => println("Please enter ONLY integer numbers!")
  }
  if (in.isDefined)
    println(s"The entered value is: ${in.get}")
  else
    withExceptionHandler()
}