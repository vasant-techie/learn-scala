package collections.list

/**
 * This code just prints the List values.
 /// @return
 */
@main
def printList(): Unit = {
  println(List(1, 2, "hello", true, 3.0))
  println(Nil) //Nil -> Empty List
  println(List()) // Empty List
  println(List[Boolean](true, false, true)) // Type-specific (Boolean) List
  println(List[Int](1, 2, 3, 1, 0, -1, -45)) // Type specific (Int) List
}
