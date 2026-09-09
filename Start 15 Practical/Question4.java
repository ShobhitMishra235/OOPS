/*

WAP to count the number of charcters in a given string,  
to reverse the string and 
check whether it is palindrome or not?  

*/
import java.util.Scanner;

class StringOperations {

    String str;

    // Constructor
    StringOperations(String str) {
        this.str = str;
    }

    // Method to count characters
    void countCharacters() {
        System.out.println("Number of characters = " + str.length());
    }

    // Method to reverse string
    String reverseString() {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    // Method to check palindrome
    void checkPalindrome() {

        String reverse = reverseString();

        if (str.equals(reverse)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }
    }
}

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Creating object
        StringOperations obj = new StringOperations(str);

        // Calling methods
        obj.countCharacters();

        System.out.println("Reversed string = " + obj.reverseString());

        obj.checkPalindrome();

        sc.close();
    }
}


