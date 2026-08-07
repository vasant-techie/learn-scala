package booleans

import scala.io.StdIn

@main
def booleanOperations(): Unit = {
  val flag = StdIn.readBoolean()
  // If input given by user is "Yes", then it considers it as "true"
  if (flag) {
    println("It's true!")
  } else {
    println("It's false")
  }
}