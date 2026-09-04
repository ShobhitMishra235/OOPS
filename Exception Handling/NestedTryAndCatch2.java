public class NestedTryAndCatch2 {
public static void main(String[] args) {
 try {
    System.out.println("A");
     try {
        System.out.println("B");
        int x = 10 / 0;       // exception
        System.out.println("C");
    }
    catch (Exception e) {
        System.out.println("D");
    }

    System.out.println("E");
}
catch (Exception e) {
    System.out.println("F");
}
    }
}
