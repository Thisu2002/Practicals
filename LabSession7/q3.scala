object LambdaThree {
    def main(args: Array[String]): Unit = {
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println("Initial List: " + input)
        
        val output = filterPrime(input)
        println("Filtered List: " + output)
    }

    def isPrime(num: Int): Boolean = {
        if (num <= 1) false
        else if (num == 2) true
        else {
            !(2 to Math.sqrt(num).toInt).exists(i => num % i == 0)
        }
    }

    def filterPrime(intList: List[Int]): List[Int] = {
        intList.filter(num => isPrime(num))
    }
}