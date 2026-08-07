package operators

@main
def operatorsChallenge(): Unit = {
  val name = "Alice"
  val age = 30
  val x = 1.23456789

  println(f"$name is $age years old")
  // Alice is 30 years old

  println(s"${(1 + 2 + " hello")}")

  println(f"x = $x%.2f")
  // x = 1.23  (rounded to 2 decimal places)

  println(f"x = $x%8.3f")
  // x =    1.235  (width 8, 3 decimals)
}