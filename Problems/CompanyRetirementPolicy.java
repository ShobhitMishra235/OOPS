class Employee {
    final int RETIREMENT_AGE = 60;
    public void checkRetirementEligibility(int age) {
        if (age >= RETIREMENT_AGE) {
            System.out.println("Eligible for retirement.");
        } else {
            System.out.println("Not eligible for retirement.");
        }
    }
}
public class CompanyRetirementPolicy {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.checkRetirementEligibility(65); // Eligible for retirement.

        Employee emp2 = new Employee();
        emp2.checkRetirementEligibility(55); // Not eligible for retirement.
    }
}
