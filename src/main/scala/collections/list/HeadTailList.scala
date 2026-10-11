package collections.list

@main
def printHeadTailOfList(): Unit = {
  val list = List(0, 1, 2, 3)
  println(list.head)
  println(list.tail)
  println(list.tail.tail.tail.head)
}