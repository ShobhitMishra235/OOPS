/*

WAP to create a class “SimpleObject” and display messages by using the constructor of this class.

*/
class SimpleObject {

    // Constructor
    SimpleObject() {
        System.out.println("Object has been created.");
        System.out.println("This message is displayed using constructor.");
    }
}

public class Question6 {

    public static void main(String[] args) {

        // Creating object
        SimpleObject obj = new SimpleObject();
    }
}

