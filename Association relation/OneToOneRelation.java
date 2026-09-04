class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;
    Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }
    public void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Passport number: " + passport.getPassportNumber());
    }
}

public class OneToOneRelation {
    public static void main(String[] args){
        Passport passport = new Passport("789");
        Student student = new Student("Shobhit", passport);
        student.displayDetails();
    }
}
// Association: Student is associated with Passport.
// One-to-One Relationship: One Student has one Passport.
// Student and Passport have a One-to-One Association.