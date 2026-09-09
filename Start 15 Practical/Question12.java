/*

WAP to Create a class Employee having members as follows: 
private int empNo 
  
 
Department of IT 
private String empName 
private int empBasic 
Parameterized constructor to initialize members. 
Getter methods for all instance variables 
Create a class WriteEmployee having a main method. Ask users to 
enter details of an employee and set them in an Employee object. Store 
details of this object in a file emp.txt. Read employee details from the 
file and display those details.  

*/
import java.io.*;
import java.util.Scanner;

class Employee3 {

    private int empNo;
    private String empName;
    private int empBasic;

    // Parameterized constructor
    Employee3(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    // Getter methods
    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        int empNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Basic Salary: ");
        int empBasic = sc.nextInt();

        // Creating Employee object
        Employee3 emp = new Employee3(empNo, empName, empBasic);

        // Writing data into file
        try {
            FileWriter fw = new FileWriter("emp.txt");

            fw.write("Employee Number: " + emp.getEmpNo() + "\n");
            fw.write("Employee Name: " + emp.getEmpName() + "\n");
            fw.write("Employee Basic Salary: " + emp.getEmpBasic() + "\n");
            fw.write("Department: IT\n");

            fw.close();

            System.out.println("\nEmployee details stored successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }

        // Reading data from file
        try {
            FileReader fr = new FileReader("emp.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nEmployee Details:");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }

        sc.close();
    }
}



