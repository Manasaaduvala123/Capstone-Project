package day5_Assessment;
import java.util.ArrayList;
import java.util.List;
class BankAccount { 
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();
    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, initialDeposit);
        if (initialDeposit > 0) {
            transactionHistory.add(new Transaction("Initial Deposit", initialDeposit));
        }
    }
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount));
        return true;
    }
    public double getBalance() {
        return balance;
    }
    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) {
            return "No transactions yet.";
        }
        return transactionHistory.get(transactionHistory.size() - 1).toString();
    }
    public String toString() {
        String maskedAccount = "****" + accountNumber.substring(accountNumber.length() - 4);
        return "Account Holder: " + accountHolder +
               "\nAccount Number: " + maskedAccount +
               "\nBalance: ₹" + balance;
    }
    private class Transaction {
        private String type;
        private double amount;
        private long timestamp;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = System.currentTimeMillis();
        }
        public String toString() {
            return type + " of ₹" + amount + " at " + new java.util.Date(timestamp);
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890123456", "Manasa", 5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000);
        System.out.println(acc);
        System.out.println("Last Transaction: " + acc.getLastTransaction());
        System.out.println("Current Balance: ₹" + acc.getBalance());
    }
}

