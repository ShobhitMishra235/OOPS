/*

A restaurant has a shared Food object. Two threads work with the same food:
•	The Chef thread prepares/cooks the food using the cook() method. 
•	The Eater thread consumes the food using the eat() method. 
The Eater should not eat the food before it is prepared. Therefore, if the Eater reaches the food first, it should wait until the Chef finishes cooking. Once the food is cooked, the Chef notifies the waiting Eater.
The program should use synchronization and inter-thread communication using synchronized, wait(), and notify().

*/

package Threads;
class Food {
    boolean cooked = false;

    synchronized void cook() {
        System.out.println("Chef is cooking food...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        cooked = true;
        System.out.println("Chef finished cooking.");

        notify();
    }

    synchronized void eat() {
        try {
            while (!cooked) {
                System.out.println("Eater is waiting for food...");
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Eater is eating food.");
    }
}

public class UseOfSynchronized4 {
    public static void main(String[] args) {

        Food food = new Food();

        Thread chef = new Thread(() -> {
            food.cook();
        });

        Thread eater = new Thread(() -> {
            food.eat();
        });

        eater.start();
        chef.start();
    }
}