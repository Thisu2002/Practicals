file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/ASUSi5/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Option.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1885
uri: file:///C:/Users/ASUSi5/Desktop/FP/Practicals/LabSheet5/q2.scala
text:
```scala
import scala.io.StdIn.readLine
case class Book(title:String, author:String, isbn:String);

object LibrarySystem{
    def main(args:Array[String]):Unit = {
        val book1 = Book("Tom Sawyer", "Mark Twain", "1111");
        val book2 = Book("Mansion", "Alice Grace", "2222");
        val book3 = Book("Bowl", "Mark Tedd", "3333");

        var bookSet: Set[Book] = Set(book1, book2, book3);
        //bookSet = addBook(bookSet);
        // bookSet = removeBook(bookSet);

        // if(isBookInLibrary(bookSet))
        //     println("Book Exists.");
        // else
        //     println("Book does not exist.");

        //displayBooks(bookSet);
        displayByAuthor(bookSet);

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

    def displayBooks(bookSet: Set[Book]):Unit = {
        println(f"${"Title"}%-20s ${"Author"}%-20s ${"ISBN"}%-20s");
        for(book <- bookSet){
            println(f"${book.title}%-20s ${book.author}%-20s ${book.isbn}%-20s");
        }
    }

    def searchByTitle(bookSet: Set[Book]):Unit={
        val titleToFind = readLine("Enter title of the book: ");
        val foundBook = bookSet.find(book => book.title == titleToFind);

        foundBook matc@@
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
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/ASUSi5/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Option.scala