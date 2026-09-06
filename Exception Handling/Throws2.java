import java.io.*;
public class Throws2 {
    public static void readFile() throws FileNotFoundException {
        FileReader f = new FileReader("abc.txt");
        System.out.println("File opened");
    }
    public static void main(String args[]) {
        try {
            readFile();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
