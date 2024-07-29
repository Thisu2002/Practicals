import scala.io.StdIn.readLine

object StudentRecords {
    def main(args: Array[String]): Unit = {
        val studentRecord = getStudentInfo()
        printStudentRecord(studentRecord)
    }

    // part a
    def getStudentInfo(): (String, Int, Int, Double, Char) = {
        val name = readLine("Enter student's name: ")
        val marks = readLine("Enter marks: ").toInt
        val totalMarks = readLine("Enter total possible marks: ").toInt

        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = percentage match {
            case p if p >= 90 => 'A'
            case p if p >= 75 => 'B'
            case p if p >= 50 => 'C'
            case _            => 'D'
        }

        (name, marks, totalMarks, percentage, grade)
    }

    // part b
    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totalMarks, percentage, grade) = record
        println("----------------------------------------------------")
        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Marks: $totalMarks")
        println(f"Percentage: $percentage%.2f%%")
        println(s"Grade: $grade")
    }

    // part c
    def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
        if (name.isEmpty) {
            (false, Some("Name cannot be empty."))
        } else if (marks < 0 || marks > totalMarks) {
            (false, Some("Marks should be positive and not exceed total possible marks."))
        } else if (totalMarks <= 0) {
            (false, Some("Total marks should be a positive number."))
        } else {
            (true, None)
        }
    }

    // part d
    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        var studentRecord: (String, Int, Int, Double, Char) = null.asInstanceOf[(String, Int, Int, Double, Char)]
        var isValid = false

        while (!isValid) {
            val (name, marks, totalMarks, percentage, grade) = getStudentInfo()
            val (valid, errorMessage) = validateInput(name, marks, totalMarks)

            if (valid) {
                studentRecord = (name, marks, totalMarks, percentage, grade)
                isValid = true
            } else {
                println(s"Error: ${errorMessage.getOrElse("Invalid input.")}")
            }
        }
        studentRecord
    }
}
