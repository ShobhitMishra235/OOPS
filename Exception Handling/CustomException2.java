public class CustomException2 {
    public static void main(String[] args) {
        try {
            checkEligibility(-5);
        } 
        catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid age: " + e.getAge());
        }
    }

    public static void checkEligibility(int age) throws IllegalAgeException {
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
class IllegalAgeException extends Exception {
    private int age;
    public IllegalAgeException(String message, int age) {
            super(message);
            this.age = age;
        }
        public int getAge() {
            return age;
        }
}

/*

Custom exceptions can be both checked and unchecked.

If your custom exception extends Exception → checked exception
If it extends RuntimeException → unchecked (runtime) exception 

*/