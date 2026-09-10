package Generics;

public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        // Upcasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        // Downcasting
        Object obj2 = "Aditya";
        String s2 = (String) obj2;
        System.out.println(s2);

        Object obj3 = 10;
     /*  String obj = obj3; Not possible because obj3 is a Object class and String is a subclass of Object class. And will throw compile time error. */
     /*  String s3 = (String) obj3; This will throw ClassCastException at runtime.That's why casting doesn't convert the object from Integer to String. 
                                    It only tells Java, "treat this reference as a String" — and Java checks whether the actual object really is a String.*/
    }
}

/*

That's why casting doesn't convert the object from Integer to String. 
It only tells Java, "treat this reference as a String" — and Java checks whether the actual object really is a String.


Autoboxing = Java automatically converts a primitive value into its corresponding wrapper object.

For example:

int x = 10;

Integer obj = x;

*/