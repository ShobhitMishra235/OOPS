import java.util.*;
public class TryAndCatch3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        try {
            System.out.println(arr.get(5));
        } 
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hi");
    }
}
