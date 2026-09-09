/*

WAP to count the total number of odd numbers between 1-100, and 
display the sum of them.

*/
class OddNumbers {

    void calculate() {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                count++;
                sum = sum + i;
            }
        }

        System.out.println("Total odd numbers = " + count);
        System.out.println("Sum of odd numbers = " + sum);
    }
}

public class Question2 {
    public static void main(String[] args) {

        // Creating object
        OddNumbers obj = new OddNumbers();

        // Calling method
        obj.calculate();
    }
}
