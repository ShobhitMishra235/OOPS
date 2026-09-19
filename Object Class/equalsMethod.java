// Compare 2 objects and returns true/false.

public class equalsMethod {
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
}


/*

REFERENCE TYPE
    ↓
Student s1
Object s2
        → tells what type of reference variable it is


REFERENCE VALUE
    ↓
s1 → Object A
s2 → Object B
        → tells which object the reference points to

*/