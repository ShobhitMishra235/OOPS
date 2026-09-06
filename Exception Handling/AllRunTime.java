public class AllRunTime {
    public static void withdraw(double balance, double amount) throws IllegalStateException  {
        if(amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }
    public static void main(String[] args) {
        try {
            withdraw(5000, 7000)
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues after exception handling");
    }
}