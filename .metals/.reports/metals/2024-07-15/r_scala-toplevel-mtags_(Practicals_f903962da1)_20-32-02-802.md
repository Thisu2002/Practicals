error id: file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala:[1340..1341) in Input.VirtualFile("file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala", "import scala.io.StdIn.readLine
case class Book(title:String, author:String, isbn:String);

object LibrarySystem{
    def main(args:Array[String]):Unit = {
        val book1 = Book("Tom Sawyer", "Mark Twain", "1111");
        val book2 = Book("Mansion", "Alice Grace", "2222");
        val book3 = Book("Bowl", "Mark Tedd", "3333");

        var bookSet: Set[Book] = Set(book1, book2, book3);
        //bookSet = addBook(bookSet);
        bookSet = removeBook(bookSet);

        if(isBookInLibrary(bookSet))
            println("Book Exists.");
        else
            println("Book does not exist.");

    }

    def addBook(bookSet: Set[Book]):Set[Book] = {
        var title = readLine("Enter the title: ");
        var author = readLine("Enter the author: ");
        var isbn = readLine("Enter the isbn: ");

        val newBook = Book(title, author, isbn);
        bookSet + newBook;
    }

    def removeBook(bookSet: Set[Book]): Set[Book] = {
        val isbnToRemove = readLine("Enter ISBN to remove: ");
        //println("Book removed successfully.");
        bookSet.filterNot(_.isbn == isbnToRemove);
    }

    def isBookInLibrary(bookSet: Set[Book]): Boolean = {
        val isbnToFind = readLine("Enter ISBN to find: ");
        bookSet.exists(_.isbn == isbnToFind);
    }

    def 
}")
file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala
file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala:42: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace