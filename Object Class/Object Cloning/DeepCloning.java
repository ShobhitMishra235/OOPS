import java.util.*;

class Passport implements Cloneable {
    String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        Student clonedStudent = (Student) super.clone();

        // Deep copy: create a separate Passport object
        clonedStudent.passport = (Passport) passport.clone();

        return clonedStudent;
    }
}

public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Passport passport = new Passport("9005771481");
        Student student = new Student("Rinku", passport);

        Student clonedStudent = (Student) student.clone();

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);

        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);

        System.out.println();

        // Change Student's own field
        clonedStudent.name = "Tiger";

        // Change nested Passport object's field
        clonedStudent.passport.passportNumber = "1234567890";

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);

        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}
