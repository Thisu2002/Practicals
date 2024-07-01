//mean of two integers rounded off to two decimal places
object Mean{
    def main(args: Array[String]): Unit={
        println("Average: " + getAverage(13,270));
    }

    def getAverage(num1:Int, num2:Int): String={
        val mean = (num1 + num2).toFloat / 2;
        "%.2f".format(mean);
    }
}