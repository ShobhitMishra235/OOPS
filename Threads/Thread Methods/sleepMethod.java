public class sleepMethod {
    public static void main(String[] args) {
        System.out.println("Thread is going to sleep for 5 seconds");
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Thread woke up after sleeping");
    }
}
