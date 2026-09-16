package Abstraction;

 abstract class Car {
    Car() {
        System.out.println("Car class constructor is called");
    }
    abstract public void start();
    public void noise() {
        System.out.println("Car is making noise");
    }
 }

 abstract class Dealer extends Car {
    private int numberOfCars;
    Dealer() {
        System.out.println("Dealer constructor is ");
    }
    Dealer(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
 }

 class ManualCar extends Dealer {
    ManualCar(int number) {
        super(number);
        System.out.println("Manual car constructor");
    }
    @Override 
    public void start() {
        System.out.println("Manual car is starting");
    }
    
 }
public class ConstructorChainingInAbstractClass {
    public static void main(String[] args) {
        ManualCar manualCar2 = new ManualCar(9);
        manualCar2.start();
        manualCar2.noise();
    }
}

/*

An abstract class cannot be instantiated directly, but its constructor and inherited methods can still be used through a concrete child object. 
super is used when we specifically want to refer to the abstract superclass, especially for constructor chaining or the superclass version of an overridden method.

*/