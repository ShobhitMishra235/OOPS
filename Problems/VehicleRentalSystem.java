abstract class Vehicle {
    protected int registrationNumber;
    protected String brand;
    protected int rentPricePerDay;
    abstract void calculateRentalCost();
}

class car extends Vehicle {
    car(int registrationNumber, String brand, int rentPricePerDay) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentPricePerDay = rentPricePerDay;
    }
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
    public void calculateRentalCost(int days) {
        int totalCost = this.rentPricePerDay * days;
        System.out.println("Total rental cost for " + days + " days: ₹" + totalCost);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        car myCar = new car(1234, "Toyota", 2000);
        myCar.calculateRentalCost(3);

        bike myBike = new bike(5678, "Honda", 1000);
        myBike.calculateRentalCost(5);

        truck myTruck = new truck(9101, "Ford", 3000);
        myTruck.calculateRentalCost(2);
    }
}
