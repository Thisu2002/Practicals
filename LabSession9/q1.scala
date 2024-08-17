object Interest {
    def main(args: Array[String]): Unit = {
        val deposit = 45000;
        println("Deposit: Rs. " + deposit);
        println("Interest: Rs. " + funcInterest(deposit));
    }

    // Lambda functions for interest rates
    val rate1: Double => Double = deposit => deposit * 0.02
    val rate2: Double => Double = deposit => deposit * 0.04
    val rate3: Double => Double = deposit => deposit * 0.035
    val rate4: Double => Double = deposit => deposit * 0.065

    // Function to calculate interest based on deposit using pattern matching
    def funcInterest(deposit: Double): Double = deposit match {
        case x if x <= 20000 => rate1(x)
        case x if x <= 200000 => rate2(x)
        case x if x <= 2000000 => rate3(x)
        case _ => rate4(deposit)
    }
}
