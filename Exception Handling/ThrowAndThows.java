public class ThrowAndThows {
    public static void main(String[] args) {
        try {
            checkEligibility(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEligibility(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age < 18) {
            throw new IllegalStateException("Person is not eligible to vote");
        }
        System.out.println("Person is eligible to vote");
    }
}
