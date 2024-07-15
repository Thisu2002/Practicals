import scala.io.StdIn.readLine
case class Book(title:String, author:String, isbn:String);

object LibrarySystem{
    def main(args:Array[String]):Unit = {
        val book1 = Book("Tom Sawyer", "Mark Twain", "1111");
        val book2 = Book("Mansion", "Alice Grace", "2222");
        val book3 = Book("Bowl", "Mark Tedd", "3333");

        var bookSet: Set[Book] = Set(book1, book2, book3);

        displayBooks(bookSet);

        bookSet = addBook(bookSet);
        displayBooks(bookSet);

        bookSet = removeBook(bookSet);
        displayBooks(bookSet);

        if(isBookInLibrary(bookSet))
            println("Book exists.");
        else
            println("Book does not exist.");

        displayByAuthor(bookSet);

        searchByTitle(bookSet);
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
        bookSet.filterNot(_.isbn == isbnToRemove);
    }

    def isBookInLibrary(bookSet: Set[Book]): Boolean = {
        val isbnToFind = readLine("Enter ISBN to find: ");
        bookSet.exists(_.isbn == isbnToFind);
    }

    def displayBooks(bookSet: Set[Book]):Unit = {
        println(f"${"Title"}%-20s ${"Author"}%-20s ${"ISBN"}%-20s");
        for(book <- bookSet){
            println(f"${book.title}%-20s ${book.author}%-20s ${book.isbn}%-20s");
        }
    }

    def searchByTitle(bookSet: Set[Book]):Unit={
        val titleToFind = readLine("Enter title of the book: ");
        val foundBook = bookSet.filter(book => book.title == titleToFind);
        if(!foundBook.isEmpty)
            displayBooks(foundBook);
        else
            println("Book not found!");
    }
    
    def displayByAuthor(bookSet: Set[Book]):Unit={
        val authorToFind = readLine("Enter the author: ");
        val booksByAuthor = bookSet.filter(book => book.author == authorToFind);
        println(s"Books by ${authorToFind}:");
        for(book <- booksByAuthor){
            println(s"${book.title}");
        }
    }
}