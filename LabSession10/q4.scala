case class Account(accountNumber: String, balance: Double)

object Bank {
  
  // 4.1 List of Accounts with negative balances
  def listNegativeBalances(accounts: List[Account]): List[Account] = {
    accounts.filter(_.balance < 0)
  }

  // 4.2 Calculate the sum of all account balances
  def sumOfBalances(accounts: List[Account]): Double = {
    accounts.map(_.balance).sum
  }

  // 4.3 Calculate the final balances of all accounts after applying interest
  def applyInterest(accounts: List[Account]): List[Account] = {
    accounts.map { account =>
      val updatedBalance = if (account.balance > 0) {
        account.balance * 1.05
      } else {
        account.balance * 0.90
      }
      account.copy(balance = updatedBalance)
    }
  }
}

// Define the Main object to test the functionality
object Main extends App {
  // Sample list of accounts
  val accounts = List(
    Account("001", 1000.0),
    Account("002", -500.0),
    Account("003", 200.0),
    Account("004", -100.0)
  )

  // List of accounts with negative balances
  val negativeBalances = Bank.listNegativeBalances(accounts)
  println(s"Accounts with negative balances: $negativeBalances")

  // Calculate the sum of all account balances
  val totalBalance = Bank.sumOfBalances(accounts)
  println(s"Total balance of all accounts: $totalBalance")

  // Calculate final balances after applying interest
  val updatedAccounts = Bank.applyInterest(accounts)
  println(s"Updated account balances: $updatedAccounts")
}
