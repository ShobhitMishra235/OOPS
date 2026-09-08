/*

Question 7 — Secure Salary Calculation 
A company has a base Employee class. 
The salary calculation method contains important business rules and must not be overridden by 
subclasses. 
Create the following hierarchy: 
Employee 
├── Developer 
├── Manager 
└── Tester 
Implement: 
calculateAnnualSalary() 
in the parent class and prevent subclasses from overriding it. 
Task 
Write the Java implementation and demonstrate that subclasses cannot override the protected salary 
calculation logic.

*/
class TotalSalary {
    protected double monthlySalary;
    TotalSalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    protected final double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
}

class Developer1 extends TotalSalary {
    Developer1(double monthlySalary) {
        super(monthlySalary);
    }
    public void displayAnnualSalary() {
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

class Manager1 extends TotalSalary {
    Manager1(double monthlySalary) {
        super(monthlySalary);
    }
    public void displayAnnualSalary() {
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

class Tester1 extends TotalSalary {
    Tester1(double monthlySalary) {
        super(monthlySalary);
    }
    public void displayAnnualSalary() {
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

public class SecureSalary {
    public static void main(String[] args) {
        Developer1 dev = new Developer1(5000.0);
        dev.displayAnnualSalary(); // Annual Salary: 60000.0

        Manager1 mgr = new Manager1(7000);
        mgr.displayAnnualSalary(); // Annual Salary: 84000.0

        Tester1 tester = new Tester1(4000.0);
        tester.displayAnnualSalary(); 
    }
}
