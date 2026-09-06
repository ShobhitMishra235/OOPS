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



// Catching an exception inside the same method is not generally preferred
// when the caller is better suited to decide how to handle it.
// The method should throw the exception and let the caller handle it.
// However, if the method itself knows how to properly handle/recover from
// the exception, catching it inside the method is perfectly valid.
// To handle this you can see the code ThrowAndTryCatch3.java which is a better approach to handle the exception.