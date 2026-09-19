import java.util.*;

class Passport {
    String passportNumber;
    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

class Student implements Cloneable {
    String name;
    Passport passport;
    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
     @Override
     protected Object clone() throws CloneNotSupportedException {
        return super.clone();
     }
}
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport passport = new Passport("9005771481");
        Student student = new Student("Rinku", passport);
        Student clonedStudent = (Student) student.clone();
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);

        System.out.println();

        clonedStudent.name = "Tiger";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}
/*

Shallow copy creates a new outer object, but nested mutable objects like arrays are shared; changing the shared object's contents affects both. 
Strings don't behave this way because String is immutable.

*/