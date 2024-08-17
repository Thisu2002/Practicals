object CheckInt{
    def main(args:Array[String]):Unit={
        val number = args(0).toInt;
        println(checkInteger(number));
    }

    val isNegativeZero = (n: Int) => n <= 0
    val isEven = (n: Int) => n%2 == 0
    
    def checkInteger(num:Int):String = num match {
        case x if isNegativeZero(x) => "Negative/Zero"
        case x if isEven(x) => "Even number"
        case _ => "Odd number"
    }
}