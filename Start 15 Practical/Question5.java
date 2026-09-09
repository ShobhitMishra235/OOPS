/*

WAP to find out the sum of command line arguments.

*/
class Sum {

    void calculate(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum = " + sum);
    }
}

public class Question5 {

    public static void main(String[] args) {

        Sum obj = new Sum();

        obj.calculate(args);
    }
}

