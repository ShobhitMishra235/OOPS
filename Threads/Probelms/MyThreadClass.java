/*

WAP to Create a class MyThread derived from Thread class and 
override the run method. Create a class ThreadDemo having a main 
method. Create 2 objects of MyThread class and observe the behavior 
of threads. 

*/
package Threads.Probelms;

class ThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class MyThreadClass {

    public static void main(String[] args) {

        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass();

        t1.start();
        t2.start();
    }
}
