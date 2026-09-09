/*

WAP to insert 3 numbers from the keyboard and find a greater number 
among 3 numbers. 

*/

import java.util.Scanner;
class GreaterNumber {

    int a, b, c;

    // Constructor
    GreaterNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to find greater number
    void findGreater() {

        if (a >= b && a >= c) {
            System.out.println("Greater number = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Greater number = " + b);
        } 
        else {
            System.out.println("Greater number = " + c);
        }
    }
}
public class Question1 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Creating object
        GreaterNumber obj = new GreaterNumber(a, b, c);

        // Calling method
        obj.findGreater();

        sc.close();
    }
}
