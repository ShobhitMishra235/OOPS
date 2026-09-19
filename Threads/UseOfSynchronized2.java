/*

A bank account has an initial balance of ₹500. Two operations need to be performed concurrently:
•	A Customer wants to withdraw ₹700. 
•	The Bank wants to deposit ₹500 into the same account. 
Since the account initially contains only ₹500, the customer cannot withdraw ₹700 immediately. The withdrawal thread should therefore wait until sufficient balance becomes available.
The bank deposit operation adds ₹500 to the account and then notifies the waiting withdrawal thread. Once notified, the customer can continue the withdrawal.
The application must ensure that the account is accessed safely by multiple threads. Therefore, the withdraw() and deposit() methods are synchronized.

*/

package Threads;

public class UseOfSynchronized2 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        WithdrawalThread wd = new WithdrawalThread(obj);
        Thread thread1 = new Thread(wd, "withdraw");
        DepositThread dp = new DepositThread(obj);
        Thread thread2 = new Thread(dp, "deposit");
        thread1.start();
        thread2.start();

    }
}

class BankAccount {
    int balance = 500;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "is tryin to withdraw amount " + amount);
        while (amount < balance) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful with balance" + balance);

    }

    synchronized void deposit(int amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        balance = balance + amount;
        System.out.println("Balance is deposited new balance is" + balance);

        notify();
    }
}

class WithdrawalThread implements Runnable {
    BankAccount ba;

    WithdrawalThread(BankAccount obj) {
        this.ba = obj;
    }

    @Override
    public void run() {
        
        ba.withdraw(700);

    }
}

class DepositThread implements Runnable {
    BankAccount ba;

    DepositThread(BankAccount obj) {
        this.ba = obj;
    }

    @Override
    public void run() {
        ba.deposit(500);
    }

}