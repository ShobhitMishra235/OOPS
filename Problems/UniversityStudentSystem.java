class Student1 {
    static String universityName = "Global University";
    static int studentCount = 0;
    int studentID;
    String studentName;
    String course;
    Student1(String name, String course) {
        studentCount++;
        this.studentID = studentCount;
        this.studentName = name;
        this.course = course;
    }
    static int getStudentCount() {
        return studentCount;
    }
    void display() {
        System.out.println("University: " + universityName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
    }
}
public class UniversityStudentSystem {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Alice", "Computer Science");
        Student1 student2 = new Student1("Bob", "Mathematics");
        student1.display();
        student2.display();
        System.out.println("Total Students: " + Student1.getStudentCount());
    }
}
