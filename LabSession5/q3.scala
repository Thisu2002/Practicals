object Fibonacci{
    def main(args:Array[String]):Unit = {
        fibonacciSeq(10);
    }

    def fibonacciSeq(n: Int):Int = {
        def fibHelper(x: Int):Int = {
            if(x == 0) 0;
            else if(x == 1) 1;
            else fibHelper(x-1) + fibHelper(x-2);
        }

        for(i <- 0 to n){
            println(fibHelper(i));
        }
        fibHelper(n);
    }
}