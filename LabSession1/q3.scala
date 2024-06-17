//The volume of a sphere with radius r is 4/3 Pi r3.
//What is the volume of a sphere with radius 5?
object Volume{
    def main(args: Array[String]): Unit ={
        println("Volume of the sphere: " + sphereVolume(5))
    }

    def sphereVolume(r : Double): Double ={
        var pi = math.Pi
        return (4.0/3)*pi*(r*r*r)
    }
}