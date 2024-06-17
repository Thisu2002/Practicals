object RunTime{
    def main(args: Array[String]): Unit ={
        println("Total running time: " + (easyPace(2) + tempoPace(3)) + " min")
    }

    def easyPace(distance:Int): Int = {
        return (distance * 8)
    }

    def tempoPace(distance:Int): Int = {
        return (distance*7)
    }
}