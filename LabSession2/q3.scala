object Three{
    def main(args: Array[String]): Unit = {
        println("Take home salary: Rs." + takeHomeSalary(40, 30));
    }

    def takeHomeSalary(normalHrs :Int, OTHrs: Int): Double = {
        val normalHrRate = 250;
        val OTHrRate = 85;
        val taxRate = 0.12;
        
        var normalPay = normalHrs * normalHrRate;
        var OTPay = OTHrs * OTHrRate;

        return (normalPay + OTPay) * (1 - taxRate);
    }
}