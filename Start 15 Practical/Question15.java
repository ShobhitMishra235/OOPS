/*

WAP to Create a class MyThread derived from Thread class and 
override the run method. Create a class ThreadDemo having a main 
method. Create 2 objects of MyThread class and observe the behavior 
of threads. 

*/
class MyThread extends Thread {

    // Override run() method
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}


public class Question15 {

    public static void main(String[] args) {

        // Create two objects of MyThread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Start both threads
        t1.start();
        t2.start();
    }
}

