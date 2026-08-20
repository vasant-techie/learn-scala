package nestedMethods

@main
def nestedMethodsInScala(): Unit = {
  innerMethod()

  def innerMethod(): Unit = {
    println("Vanakkam!!")
  }
}