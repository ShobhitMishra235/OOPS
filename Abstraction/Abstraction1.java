package Abstraction;
 abstract class Car {
    abstract public void start();
    public void noise() {
        System.out.println("Car is making noise");
    }
 }

 class ManualCar extends Car {
    public void start() {
        System.out.println("Manual car is starting");
    }
   public void printName() {
    System.out.println("This is a manual car");
   } 
 }
public class Abstraction1 {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        manualCar.start();
        manualCar.noise();
     // manualCar.printName();Not possible because printName() is not defined in the Car class.To call this method see below
        ManualCar manualCar2 = new ManualCar();
        manualCar2.printName();
        manualCar2.start();
        manualCar2.noise();
    }
}

/*

An abstract method can be:

✅ public
✅ protected
✅ default (package-private)
❌ private
❌ static
❌ final

Example:

abstract class Car {

    public abstract void start();      // ✅
    protected abstract void stop();    // ✅
    abstract void drive();             // ✅ default
}
Why not private?

A subclass must be able to implement/override an abstract method. A private method isn't accessible to subclasses, so it cannot be overridden.

abstract class Car {
    private abstract void start(); // ❌
}
Quick rule

Abstract method → public, protected, or default.

And remember: an abstract method cannot be private, static, or final.

*/