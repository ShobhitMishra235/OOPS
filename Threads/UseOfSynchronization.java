package Threads;

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " is trying to withdraw " + amount);

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing...");

            balance = balance - amount;

            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Insufficient balance");
        }

        System.out.println("Balance = " + balance);
        System.out.println();
    }
}


class MyThread implements Runnable {

    BankAccount account;

    MyThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        account.withdraw(700);
    }
}


public class UseOfSynchronization {

    public static void main(String[] args) {

        // One shared BankAccount object
        BankAccount account = new BankAccount();

        // Runnable objects
        MyThread t1 = new MyThread(account);
        MyThread t2 = new MyThread(account);

        // Actual Thread objects
        Thread thread1 = new Thread(t1, "Customer-1");
        Thread thread2 = new Thread(t2, "Customer-2");

        thread1.start();
        thread2.start();
    }
}