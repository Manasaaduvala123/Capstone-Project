package day4_Assessment;
interface Bank1 {
 void deposit(double amount);
 void withdraw(double amount);
 double getBalance();
}
abstract class Account implements Bank1 {
 protected double balance;

 public Account(double initialBalance) {
     this.balance = initialBalance;
 }
public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }
 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends Account {
 private final double MIN_BALANCE = 500; // minimum required balance

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }
 public void withdraw(double amount) {
     if (balance - amount >= MIN_BALANCE) {
         balance -= amount;
         System.out.println("Withdrawn from Savings: " + amount);
     } else {
         System.out.println("Cannot withdraw! Minimum balance of " + MIN_BALANCE + " must be maintained.");
     }
 }
}
class CurrentAccount extends Account {
 public CurrentAccount(double initialBalance) {
     super(initialBalance);
 }
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from Current: " + amount);
     } else {
         System.out.println("Insufficient balance in Current Account!");
     }
 }
}
public class BankInterface {
 public static void main(String[] args) {
     Bank1 savings = new SavingsAccount(2000);
     Bank1 current = new CurrentAccount(5000);
     System.out.println("=== Savings Account Transactions ===");
     savings.deposit(1000);
     savings.withdraw(2300); 
     savings.withdraw(3000); 
     System.out.println("Savings Balance: " + savings.getBalance());
     System.out.println("\n=== Current Account Transactions ===");
     current.deposit(2000);
     current.withdraw(6000); 
     current.withdraw(2000); 
     System.out.println("Current Balance: " + current.getBalance());
 }
}

