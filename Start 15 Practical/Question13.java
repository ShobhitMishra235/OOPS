/*

WAP to create a text file in the path c:/Java/abc.txt and check whether 
that file exists or not. Using the commands exists (), isDirectory(), 
isFile(), getName() and getAbsolutePath().

*/
import java.io.File;
import java.io.IOException;

public class Question13 {

    public static void main(String[] args) {

        // Create File object
        File file = new File("C:/Files of oops/abc.txt");

        try {

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Check whether file exists
            System.out.println("Exists: " + file.exists());

            // Check whether it is a directory
            System.out.println("Is Directory: " + file.isDirectory());

            // Check whether it is a file
            System.out.println("Is File: " + file.isFile());

            // Display file name
            System.out.println("File Name: " + file.getName());

            // Display absolute path
            System.out.println("Absolute Path: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
