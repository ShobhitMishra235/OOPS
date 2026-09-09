/*

WAP to create a class Employee with a method called 
calculateSalary(). Create two subclasses Manager and Programmer. In 
each subclass, override the calculateSalary() method to calculate and 
return the salary based on their specific roles. 

*/
abstract class Employee {

    // Abstract method
    abstract double calculateSalary();
}

class Manager extends Employee {

    double basicSalary;

    Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return basicSalary + 10000;   // Manager gets ₹10,000 bonus
    }
}

class Programmer extends Employee {

    double basicSalary;

    Programmer(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return basicSalary + 5000;    // Programmer gets ₹5,000 bonus
    }
}

public class Question10 {

    public static void main(String[] args) {

        Employee e;

        e = new Manager(50000);
        System.out.println("Manager Salary = ₹" + e.calculateSalary());

        e = new Programmer(40000);
        System.out.println("Programmer Salary = ₹" + e.calculateSalary());
    }
}

