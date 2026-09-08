/*

Question 4 — Vehicle Rental System 
Create a vehicle rental system for a company that rents: 
 Cars 
 Bikes 
 Trucks 
Create an abstract class: 
Vehicle 
It should contain common information such as: 
 Registration number 
 Brand 
 Rental price 
Declare an abstract method: 
calculateRentalCost(days) 
Each vehicle type should calculate its rental cost differently. 
Task 
1. Create the abstract class. 
2. Create the required subclasses. 
3. Implement calculateRentalCost(). 
4. Demonstrate runtime polymorphism.

*/
abstract class Vehicle {
    protected int registrationNumber;
    protected String brand;
    protected int rentPricePerDay;
    abstract void calculateRentalCost(int days);
}

class car extends Vehicle {
    car(int registrationNumber, String brand, int rentPricePerDay) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentPricePerDay = rentPricePerDay;
    }
    @Override
    public void calculateRentalCost(int days) {
        int totalCost = this.rentPricePerDay * days;
        System.out.println("Total rental cost for " + days + " days: ₹" + totalCost);
    }
}

class bike extends Vehicle {
    bike(int registrationNumber, String brand, int rentPricePerDay) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentPricePerDay = rentPricePerDay;
    }

    @Override 
    public void calculateRentalCost(int days) {
        int totalCost = this.rentPricePerDay * days;
        System.out.println("Total rental cost for " + days + " days: ₹" + totalCost);
    }
}

class truck extends Vehicle {
    truck(int registrationNumber, String brand, int rentPricePerDay) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentPricePerDay = rentPricePerDay;
    }

    @Override 
    public void calculateRentalCost(int days) {
        int totalCost = this.rentPricePerDay * days;
        System.out.println("Total rental cost for " + days + " days: ₹" + totalCost);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle myCar = new car(1234, "Toyota", 2000);
        myCar.calculateRentalCost(3);

        Vehicle myBike = new bike(5678, "Honda", 1000);
        myBike.calculateRentalCost(5);

        Vehicle myTruck = new truck(9101, "Ford", 3000);
        myTruck.calculateRentalCost(2);
    }
}
