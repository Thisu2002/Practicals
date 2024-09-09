object WordUtils {

  // Define the function countLetterOccurrences
  def countLetterOccurrences(words: List[String]): Int = {
    // Transform each word into its length
    val lengths = words.map(_.length)
    
    // Reduce the list of lengths to get the total count
    val totalLetterCount = lengths.reduce(_ + _)
    
    totalLetterCount
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }
}
