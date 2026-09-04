public class NestedTryAndCatch {
     try {
            int a = 10 / 0;   // Exception occurs here
        }

        catch (Exception e) {
            System.out.println("A");

            try {
                System.out.println("B");

                int x = 10 / 0;   // Exception occurs again

                System.out.println("C");
            }

            catch (Exception e2) {
                System.out.println("D");
            }

            System.out.println("E");
        }

        System.out.println("F");
    }
