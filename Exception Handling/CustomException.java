public class CustomException {
    public static void main(String[] args) {
        try {
            checkEligibility(-5);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid age: " + e.getAge());
        }
    }

    public static void checkEligibility(int age) {
        if (age <= 0) {
            throw new IllegalAgeException("Age cannot be negative", age);
        }
        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
class IllegalAgeException extends RuntimeException {
    private int age;
    public IllegalAgeException(String message, int age) {
            super(message);
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }