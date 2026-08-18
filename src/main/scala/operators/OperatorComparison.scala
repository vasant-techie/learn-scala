package operators

@main
def operatorComparison(): Unit = {
  val a = 5
  val b = 3
  val flag = false

  println(s"$a > $b will return ${a>b}")

  println (a < b)
  println (a >= b)
  println (a <= b)
  println (a == b)
  println (!flag == true)
  println (flag != true)

  val r1 = a != b
  val r2 = a >= b

  println ("Printing the flag comparison result: ")
  println (r1 || r2)
  println (r1.getClass)
}
