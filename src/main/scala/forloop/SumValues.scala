package forloop

object SumValues {
  def main(args: Array[String]): Unit = {
    println(sum(5, 5, 5, 5))
  }

  def sum(nums: Int*): Int = {
    var result = 0
    for num <- nums do
        result += num
    result
  }
}
