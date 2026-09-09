/*

WAP to Implement three classes: Storage, Counter and Printer 
The Storage class should store an integer. 
The Counter class should create a thread and start counting from 0 
(0,1,2, 3 ...) and store each value in the Storage class. 
The Printer class should create a thread that keeps reading the value in 
the Storage class and printing it. 
Write a program that creates an instance of the Storage class and set up 
a Counter and Printer object to operate on it.

*/
class Storage {

    private int value;

    // Store value
    public void setValue(int value) {
        this.value = value;
    }

    // Read value
    public int getValue() {
        return value;
    }
}


// Counter class creates a thread
class Counter extends Thread {

    private Storage storage;

    Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {

        for (int i = 0; i <= 10; i++) {

            storage.setValue(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Counter interrupted");
            }
        }
    }
}


// Printer class creates a thread
class Printer extends Thread {

    private Storage storage;

    Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {

        int previous = -1;

        while (previous < 10) {

            int value = storage.getValue();

            if (value != previous) {
                System.out.println("Value: " + value);
                previous = value;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Printer interrupted");
            }
        }
    }
}


public class Question14 {

    public static void main(String[] args) {

        // Create one Storage object
        Storage storage = new Storage();

        // Create Counter and Printer objects
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        // Start both threads
        counter.start();
        printer.start();
    }
}


