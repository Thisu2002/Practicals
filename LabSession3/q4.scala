//sum of even numbers in a list
object SumOfEven{
    def main(args: Array[String]):Unit = {
        println("Sum of even numbers in the list: " + sumList(List(21,4,5,34,10)));
    }

    def sumList(intList: List[Int]): Int = {
        var sum = 0;
        for(num <- intList){
            if(num % 2 == 0)
                sum += num;
        }
        return sum;
    }
}