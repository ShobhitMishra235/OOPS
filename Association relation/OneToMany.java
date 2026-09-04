import java.util.*;
class Student {
    private String name;
    private String id;
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    } 
}

class College {
    private String name;
    private List<Student> students;
    College(String name) {
        this.name = name;
        students = new ArrayList<>();
    }
    public void addStudents(Student student) {
        students.add(student);
    }
    public void printAllStudents() {
        for(int i = 0; i <students.size(); i++){
            Student student = students.get(i);
            System.out.println("Name " + student.getName() + "id: " + student.getId() + "college: " + name);
        }
    }

}
public class OneToMany {
    public static void main(String[] args ){
        Student student1 = new Student("Shobhit", "2");
        Student student2 = new Student("Harshit", "1");
        College college = new College("kiet");
        college.addStudents(student1);
        college.addStudents(student2);
        college.printAllStudents();
    }
    
}
