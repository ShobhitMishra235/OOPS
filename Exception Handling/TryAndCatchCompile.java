import java.io.*;
public class TryAndCatchCompile {
    public static void main(String args[]) {
        try {
            FileReader f = new FileReader("abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }  
    }
}
