// returns the reverse of the string
object StringReversal{
    def main(args: Array[String]): Unit={
        println("Reversed String: " + reverseString("abcdefg"));
    }

    def reverseString(str: String): String={
        if(str.isEmpty()) "";
        else
        reverseString(str.tail) + str.head;
    }
}