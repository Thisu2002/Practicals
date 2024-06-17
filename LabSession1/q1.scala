//Area of a disk with radius r is pi r*r. What is the area of a disk with
//radius 5?
object Area{
    def main(args: Array[String]): Unit ={
        println("Area of the disk: " + diskArea(5))
    }

    def diskArea(r : Double): Double ={
        var pi = math.Pi
        return (pi*r*r)
    }
}