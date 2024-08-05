object LambdaOne {
    def main(args: Array[String]): Unit = {
        val input = List(1,2,3,4,5,6,7,8,9,10);
        println("Initial List: " + input);
        
        val output = filterEvenNumbers(input);
        println("Filtered List: " + output);
    }

    def filterEvenNumbers(intList: List[Int]): List[Int] = {
        intList.filter(num => num % 2 == 0);
    }
}