object StringFormatter {
    def main(args: Array[String]): Unit = {

        val name1 = formatNames("Benny")(toUpper);

        val name2 = formatNames("Niroshan")(name => {
            val part1 = name.substring(0, 2).toUpperCase();
            val part2 = name.substring(2).toLowerCase();
            part1 + part2;
        })

        val name3 = formatNames("Saman")(toLower);

        val name4 = formatNames("Kumara")(name => {
            val part1 = name.substring(0, 1).toUpperCase();
            val part2 = name.substring(1, name.length - 1).toLowerCase();
            val part3 = name.substring(name.length - 1).toUpperCase();
            part1 + part2 + part3;
        })

        println(name1);
        println(name2);
        println(name3);
        println(name4);
    }


    def toUpper(str: String): String = str.toUpperCase()

    def toLower(str: String): String = str.toLowerCase()

    def formatNames(name: String)(format: String => String): String = format(name)
}
