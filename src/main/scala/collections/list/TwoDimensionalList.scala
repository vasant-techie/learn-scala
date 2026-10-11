package collections.list

@main
def twoDimList(): Unit = {
  val matrix = List(
    List(1, 3, "வணக்கம்", true, 3.0),
    List(2, 7, "Vanakkam!", true, 2.2),
    List(5, 4, "ji", true, 1.4)
  )

  println(matrix(0)(2))
  println(matrix.head(2))
}