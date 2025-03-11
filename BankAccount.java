// Parent class Bank
class Bank {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public Bank(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (only allows non-negative values)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Cannot be negative.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount extends Bank
class SavingsAccount extends Bank {
    private double interestRate; // Interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    // Display savings account details
    public void displaySavingsAccount() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);   // Accessible (public)
        System.out.println("Account Holder: " + accountHolder);   // Accessible (protected)
        System.out.println("Balance: " + getBalance());          // Accessed via getter
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Creating a Bank object
        Bank acc1 = new Bank("123456789", "Alice", 5000.0);
        System.out.println("Bank Account Details:");
        acc1.displayAccountDetails();

        // Performing transactions
        acc1.deposit(1000);
        acc1.withdraw(700);
        System.out.println("Updated Balance: " + acc1.getBalance());

        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savAcc = new SavingsAccount("987654321", "Bob", 3000.0, 5.0);
        savAcc.displaySavingsAccount();
    }
}
/*
Bank Account Details:
Account Number: 123456789
Account Holder: Alice
Balance: 5000.0
Deposited: $1000.0
Withdrawn: $700.0
Updated Balance: 5300.0

Savings Account Details:
Account Number: 987654321
Account Holder: Bob
Balance: 3000.0
Interest Rate: 5.0%
Calculated Interest: 150.0
 */