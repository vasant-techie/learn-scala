package exceptions

import scala.io.StdIn

@main
def exceptionChallenge(): Unit = {
  val pricePerQty = 9.99
  val productName = StdIn.readLine("Please enter the Product you would like to buy: ")
  val productQty = StdIn.readLine("Please enter the quantity: ")

  try {
    val quantity = productQty.toInt
    val totalPrice = quantity * pricePerQty
      println(s"Please pay this amount: ${totalPrice}")
    println(s"Data type of this totalPrice variable is: ${totalPrice.getClass}")
  } catch {
    case e: NumberFormatException => println("Please enter only integer numbers!")
      throw e
  }


}