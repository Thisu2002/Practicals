object Book{
    def main(args: Array[String]): Unit ={
        var numOfCopies = 40
        var totBookPrice: Double = 24.95 * numOfCopies * 0.60  //with discount for all copies
        var finalPrice: Double = (totBookPrice + shippingCost(numOfCopies))
        println(f"Total wholesale cost for $numOfCopies copies: Rs. $finalPrice%.2f")
    }

    def shippingCost(n : Int): Double ={
        var x = n-50
        if(x >= 0)
            return (3.00 + (x*0.75))
        else
            return 0
    }
}
