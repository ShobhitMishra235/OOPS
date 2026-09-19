public class equalsMethod2 {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Harshit";
        s1.age = 16;

        System.out.println(s1.toString());

        Students s2 = new Students();
        s2.name = "Harshit";
        s2.age = 16;

        System.out.println(s1.equals(s2));
    }
}

class Students {
    String name;
    int age;

    @Override
    public String toString() {
        return name + " , " + age;
    }

    @Override 
    public boolean equals(Object obj) {
        Students s = (Students) obj;
        return (this.name == s.name && this.age == s.age);
    }
}

/*

this

means:

the object on which the method was called.

*/