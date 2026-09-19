public class InstanceOfOperator {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Harshit";
        s1.age = 16;

        System.out.println(s1.toString());

        Students s2 = new Students();
        s2.name = "Harshit";
        s2.age = 16;

        System.out.println(s1.equals(s2));

        System.out.println(s1 instanceof Students);
    }
}

class Students {
    String name;
    int age;

    @Override
    public String toString() {
        return name + " , " + age;
    }
}
/*

instanceOf operator -> Check if an object is instance of a class or any of its subclass.

*/