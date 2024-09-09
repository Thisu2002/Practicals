class Account(var balance: Double) {
  
  // Deposit money into the account
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $amount, new balance: $balance")
  }

  // Withdraw money from the account
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (balance >= amount) {
      balance -= amount
      println(s"Withdrew $amount, new balance: $$balance")
    } else {
      println("Insufficient balance!")
    }
  }

  // Transfer money from this account to another account
  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (balance >= amount) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $amount to the other account")
    } else {
      println("Insufficient balance for transfer!")
    }
  }

  override def toString: String = f"Account balance: $balance%.2f"
}

object TestAccount extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  println(s"Initial state: ${account1}, ${account2}")

  account1.deposit(200.0)  // Deposit $200 into account1
  account1.withdraw(150.0) // Withdraw $150 from account1
  account1.transfer(300.0, account2) // Transfer $300 from account1 to account2
  
  println(s"Final state: ${account1}, ${account2}")
}
