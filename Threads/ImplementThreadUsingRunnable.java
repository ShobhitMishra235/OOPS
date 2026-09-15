package Threads;

public class ImplementThreadUsingRunnable {
    public static void main(String[] args) { // Creating Runnable object MyThread obj = new MyThread(); // Creating Thread objects Thread t1 = new Thread(obj); Thread t2 = new Thread(obj); // Starting the threads t1.start(); t2.start(); }
}
