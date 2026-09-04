package collections

@main
def collectionsExample(): Unit = {
  val ageGroups = List(2.5f, 3, 1, 18, 25)
  println(s"Head element is: ${ageGroups.head}")
  println(s"Tail elements are: ${ageGroups.tail}")
}
