package exceptions

import scala.annotation.tailrec
import scala.io.StdIn

@main
def learnExceptionsInScala(): Unit = {
  withoutExceptionHandler()
  withExceptionHandler()
}

def withoutExceptionHandler(): Unit = {
  print("Please enter Integer number: ")
  val in = StdIn.readInt()
  println(s"The entered value is: ${in}")
}

@tailrec
def withExceptionHandler(): Unit = {
  print("Please enter Integer number: ")
  var in: Option[Int] = None
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