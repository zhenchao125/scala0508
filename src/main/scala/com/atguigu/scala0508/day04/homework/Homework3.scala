package com.atguigu.scala0508.day04.homework

/**
  * Author lzc
  * Date 2019-09-07 09:01
  */
object Homework3 {
    def main(args: Array[String]): Unit = {
        val account: BankAccount = new CheckingAccount(10000)
    
        println(account.deposit(100))
        println(account.withdraw(100))
    }
}

class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    
    def deposit(amount: Double) = {
        balance += amount
        balance
    }
    
    def withdraw(amount: Double) = {
        balance -= amount
        balance
    }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    
    override def deposit(amount: Double): Double = {
        super.deposit(amount - 1)
    }
    
    override def withdraw(amount: Double): Double = {
        super.withdraw(amount + 1)
    }
    
}


/*
3. 扩展如下的 BankAccount类，新类 CheckingAccount 对每次存款和取款都收取1美元的手续费 

    class BankAccount(initialBalance: Double) {
        private var balance = initialBalance

        def deposit(amount: Double) = {
            balance += amount
            balance
        }

        def withdraw(amount: Double) = {
            balance -= amount
            balance
        }
    }
 */
