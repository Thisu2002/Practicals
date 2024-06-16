//The temperature is 35C; convert this temperature into Fahrenheit.
//ºF =ºC * 1.8000 + 32.00
object Temperature{
    def main(args: Array[String]): Unit ={
        var temp = 37
        println("Temperature " + temp + "ºC = " + cTof(temp) + "ºF")
    }

    def cTof(x:Double): Double={
        return (x*1.80)+32.00
    }
}