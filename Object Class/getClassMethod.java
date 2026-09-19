import java.util.*;
public class getClassMethod {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Harshit";
        s1.age = 16;

        System.out.println(s1.toString());

        Students s2 = new Students();
        s2.name = "Harshit";
        s2.age = 16;

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println(s1.getClass().getName());
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

        if(this == obj) {
            return true;
        }

    // If Object is null and accessing its fields may give NullPointerException.
        if(obj == null) {
            return false;
        }

    // Check if both classes are of type Student. If not checked we will get ClassCastException.
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        Students s = (Students) obj;
        return (this.name == s.name && this.age == s.age);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(name, age);
    }
}