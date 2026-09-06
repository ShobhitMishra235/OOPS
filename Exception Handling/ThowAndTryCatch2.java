public class ThowAndTryCatch2 {
 public static void main(String[] args) {
        checkEligibility(-5);

        System.out.println("Back in main");
    }

 public static void checkEligibility(int age) {

        try {
            if (age <= 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

