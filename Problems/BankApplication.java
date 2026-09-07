/*

Question 2 — Bank Account 
Develop a simple banking application. 
Create a BankAccount class containing: 
 accountNumber 
 accountHolderName 
 balance 
The balance must not be directly accessible or modifiable from outside the class. 
Implement the following methods: 
deposit(amount) 
withdraw(amount) 
getBalance() 
Apply these rules: 
 Deposit amount must be greater than 0. 
 Withdrawal amount must not exceed the current balance. 
 Invalid operations should display an appropriate message. 
Task 
Implement the class using proper encapsulation and demonstrate its use. 
OOP Concepts: Encapsulation, Access Modifiers, Data Validation  

*/
class BankAccount1 {

    private double balance;
    private String password;

    BankAccount1(double balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    // Getter
    public double getBalance(String password) {

        if (this.password.equals(password)) {
            return balance;
        } else {
            System.out.println("Incorrect password.");
            return -1;
        }
    }

    // Deposit
    public void setDeposit(double amount, String password) {

        if (!this.password.equals(password)) {
            System.out.println("Incorrect password.");
            return;
        }

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdrawal
    public void setWithdraw(double amount, String password) {

        if (!this.password.equals(password)) {
            System.out.println("Incorrect password.");
            return;
        }

        withdraw(amount);
    }

    // Private withdrawal method
    private void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}


public class BankApplication {

    public static void main(String[] args) {

        BankAccount1 account =
                new BankAccount1(5000, "1234");

        account.setDeposit(2000, "1234");

        account.setWithdraw(1000, "1234");

        System.out.println(
                "Balance: " + account.getBalance("1234")
        );
    }
}