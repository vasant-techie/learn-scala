package collections.array

@main
def advancedArraysFunc(): Unit = {
  val arr = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  println("Printing the array of numbers using forEach...")
  arr.foreach {element =>
    print(element + ", ")
  }

  println("Mapping the array of number into String..")
  val strings = arr.map(_.toString)
  println("\nPrinting the array of strings ...")
  println(strings.mkString("[", "; ", "]"))
}
