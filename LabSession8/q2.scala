object Multiple{
    def main(args: Array[String]): Unit = {
        val input = args(0).toInt

        val isMultipleOf3 = (n: Int) => n%3 == 0
        val isMultipleOf5 = (n: Int) => n%5 == 0
    

        input match {
            case x if (isMultipleOf3(x) && isMultipleOf5(x)) => println("Multiple of Both Three and Five")
            case x if isMultipleOf3(x) => println("Multiple of Three")
            case x if isMultipleOf5(x) => println("Multiple of Five")
            case _ => println("Not a multiple of Three or Five")
        }
    }
}