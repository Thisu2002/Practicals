object LambdaTwo{
    def main(args: Array[String]): Unit = {
        val input = List(1,2,3,4,5);
        println("Initial List: " + input);
        
        val output = calculateSquare(input);
        println("Squared List: " + output);
    }

    def calculateSquare(intList: List[Int]): List[Int] = {
        intList.map(num => num*num);
    }
}