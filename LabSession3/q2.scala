object ListQ{
    def main(args: Array[String]): Unit={
        println("\nFiltered List: " + listReturn(List("Apple", "Orange","Yellow","Red","Pink")));
    }

    def listReturn(initialList: List[String]): List[String]={
        println("Initial List: " + initialList);
        initialList.filter(x => x.length > 5);
    }
}