package Object Class;

public class toStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harshit";
        s1.age = 16;
        System.out.println(s1.toString());
    }
}

class Student {
    String name;
    int age;
}
