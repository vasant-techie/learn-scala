package collections.array

@main
def arrayBasics(): Unit = {
  val arr = Array(1, 2, 3)
  println("Printing an array!")
  println(arr)
  println("Printing an array using mkString!!")
  println(arr.mkString("[", "; ", "]"))
  println("Printing with foreach!!")
  arr.foreach(print)
}