public class AllCompileTime {

    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after exception handling");
    }
}
