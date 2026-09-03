import java.util.*;

public class TryAndCatch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        try {
            System.out.println(arr.get(5));
        }
        catch (Exception e){
            System.out.println("Exception occured at line 10 " + e.getMessage());
        }
        System.out.println("Hi");

        /* 

       The exception interrupts the normal flow of the program. Without exception handling, the program would terminate at that point and Hi would not execute. With try-catch, the exception is handled, so execution continues after the catch block and Hi is printed.
        
        */ 

    }
}
