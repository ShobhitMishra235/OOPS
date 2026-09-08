/*

Question 1 — Employee Management System 
A company wants to develop an employee management system. 
Create a base class Employee containing: 
 name 
 employeeId 
 salary 
Create the following child classes: 
 Developer 
 Manager 
 Tester 
Each employee should have a displayDetails() method. 
Task 
1. Implement the classes using inheritance. 
2. Override displayDetails() in each child class. 
3. Create objects of all three employee types. 
4. Display the details of each employee. 
OOP Concepts: Inheritance, Method Overriding 

*/

abstract class Employee1 {
    protected String name;
    protected int employeeId;
    protected double salary;

    public Employee1(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public abstract void displayDetails();
}
class Developer extends Employee1 {
    public Developer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee1 {
    public Manager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
class Tester extends Employee1 {
    public Tester(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("Tester Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeMangementSystem {
    public static void main(String[] args) {
        Developer d = new Developer("Rahul", 101, 60000);
        Manager m = new Manager("Amit", 102, 90000);
        Tester t = new Tester("Priya", 103, 50000);
        d.displayDetails();
        System.out.println();
        m.displayDetails();
        System.out.println();
        t.displayDetails();
    }
}
