package Inheritance;
class Student {
    String name;
    int rollNo;
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No:" + rollNo);
    }
}

class Result extends Student {
    int marks;
    void displayResult() {
        System.out.println("Marks: " + marks);
    }
}

public class InheritancePractice2 {
    public static void main(String[] args) {
        Result r = new Result();
        r.name = "Rahul";
        r.rollNo = 101;
        r.marks = 55;
        r.displayStudent();
        r.displayResult();
    }
}
