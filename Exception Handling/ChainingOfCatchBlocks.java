public class ChainingOfCatchBlocks {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}
