/*

WAP to implement the concept of method overloading and method 
overriding. And Abstract Class. 

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

public class Question11 {

    public static void main(String[] args) {

        Employee e;

        e = new Manager(50000);
        System.out.println("Manager Salary = ₹" + e.calculateSalary());

        e = new Programmer(40000);
        System.out.println("Programmer Salary = ₹" + e.calculateSalary());
    }
}


