//Area of a disk with radius r is Pi r*r. What is the area of a disk with
//radius 5?
object Area{
    def main(args: Array[String]): Unit ={
        println("Area of the disk: " + diskArea(5));
    }

    def diskArea(r : Double): Double ={
        var Pi:Double = 3.14
        return (Pi*r*r)
    }
}