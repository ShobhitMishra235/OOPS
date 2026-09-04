package Problems;
class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Internal method to update balance
    protected void updateBalance(double amount) {
        balance += amount;
    }

    // Interest method
    public double calculateInterest() {
        return 0;
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}


// Savings Account
class SavingsAccount extends Account {

    // Constructor
    SavingsAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    // Overriding interest method
    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;   // 4% interest
    }
}


// Current Account
class CurrentAccount extends Account {

    private double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber, String customerName, double balance, double overdraftLimit) {

        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method
    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= getBalance() + overdraftLimit) {

            updateBalance(-amount);

            System.out.println("Withdrawn: " + amount);

        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    // Current account does not earn interest
    @Override
    public double calculateInterest() {
        return 0;
    }
}


// Main Class
public class BankAccount {
        public static void main(String[] args) {

        // Savings Account object
        SavingsAccount s1 =
                new SavingsAccount(101, "Rahul", 5000);

        System.out.println("----- Savings Account -----");

        s1.display();

        s1.deposit(2000);
        s1.withdraw(1000);

        System.out.println("Interest: " + s1.calculateInterest());
        System.out.println("Final Balance: " + s1.getBalance());


        // Current Account object
        CurrentAccount c1 = new CurrentAccount(102, "Amit", 3000, 2000);

        System.out.println("\n----- Current Account -----");

        c1.display();

        c1.deposit(1000);

        // Balance = 4000
        // Overdraft = 2000
        // Maximum withdrawal = 6000
        c1.withdraw(5000);

        System.out.println("Interest: " + c1.calculateInterest());
        System.out.println("Final Balance: " + c1.getBalance());
    }
}
