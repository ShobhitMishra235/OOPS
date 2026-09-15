package Abstraction;
 abstract class Car {
    abstract public void start();
    public void noise() {
        System.out.println("Car is making noise");
    }
 }

 abstract class ElectricCar extends Car {
    abstract public void charge();
 }

 class ManualCar extends ElectricCar {
    public void start() {
        System.out.println("Manual car is starting");
    }

    public void charge() {
        System.out.println("Manual car is charging");
    }

   public void printName() {
    System.out.println("This is a manual car");
   } 
 }
public class InheritanceInAbstractClasses {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        manualCar.start();
        manualCar.noise();
     // manualCar.printName();Not possible because printName() is not defined in the Car class.To call this method see below
        ManualCar manualCar2 = new ManualCar();
        manualCar2.printName();
        manualCar2.start();
        manualCar2.noise();
        manualCar2.charge();
    }
}
/*

ElectricCar car = new ElectricCar(); // ❌
Abstract class → no direct object creation, but reference variables are allowed. ✅

*/