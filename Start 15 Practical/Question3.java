/*

WAP to Find largest and smallest numbers in an array. 

*/

import java.util.Scanner;

class ArrayNumbers {

    int[] arr;

    // Constructor
    ArrayNumbers(int[] arr) {
        this.arr = arr;
    }

    // Method to find largest and smallest
    void findLargestSmallest() {

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
    }
}

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating object
        ArrayNumbers obj = new ArrayNumbers(arr);

        // Calling method
        obj.findLargestSmallest();

        sc.close();
    }
}

