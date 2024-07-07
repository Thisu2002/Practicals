//mean of two integers rounded off to two decimal places
object AverageCalculator {
  def main(args: Array[String]): Unit = {
    val num1 = 13
    val num2 = 270
    val result = arithmeticMean(num1, num2)
    println(f"Average of $num1 and $num2 is: $result%.2f")
  }

  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    val roundedMean = math.round(mean * 100) / 100.0
    roundedMean
  }
}

