/*

WAP to create class Number with only one private instance variable as  a double primitive type, include the following methods 
isZero(),  isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong()  in this class and
 all above methods should return boolean primitive  type like for isPositive() should return “Positive = True”.   
 
 */
import java.util.Scanner;

class Number {

    // Only one private instance variable
    private double value;

    // Constructor
    Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        return value == 0;
    }

    boolean isPositive() {
        return value > 0;
    }

    boolean isNegative() {
        return value < 0;
    }

    boolean isOdd() {
        if (value != (int) value)
            return false;

        return (int) value % 2 != 0;
    }

    boolean isEven() {
        if (value != (int) value)
            return false;

        return (int) value % 2 == 0;
    }

    boolean isPrime() {

        if (value != (int) value || value < 2)
            return false;

        int n = (int) value;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    boolean isAmstrong() {

        if (value != (int) value || value < 0)
            return false;

        int n = (int) value;
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, digits);
            n = n / 10;
        }

        return sum == original;
    }
}

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        Number obj = new Number(n);

        System.out.println("Zero = " + obj.isZero());
        System.out.println("Positive = " + obj.isPositive());
        System.out.println("Negative = " + obj.isNegative());
        System.out.println("Odd = " + obj.isOdd());
        System.out.println("Even = " + obj.isEven());
        System.out.println("Prime = " + obj.isPrime());
        System.out.println("Amstrong = " + obj.isAmstrong());

        sc.close();
    }
}
