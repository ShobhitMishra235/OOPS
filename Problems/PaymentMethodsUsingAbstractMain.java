/*

Question 3 — E-Commerce Payment System 
An e-commerce application supports multiple payment methods: 
 Credit Card 
 UPI 
 PayPal 
Create a common Payment type with a method: 
pay(amount) 
Each payment method should provide its own implementation. 
The checkout system should be able to work with a common Payment reference without knowing the 
actual payment implementation. 
Task 
Write a Java program demonstrating this design. 
For example, the following should be possible: 
Payment payment = new CreditCardPayment(); 
payment.pay(5000); 
payment = new UPIPayment(); 
payment.pay(2500);  

*/
abstract class Payment {

    abstract void pay(double amount);
}

class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class PayPal extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

class Checkout {

    void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class PaymentMethodsUsingAbstractMain {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        Payment payment;

        payment = new CreditCard();
        checkout.processPayment(payment, 5000);

        payment = new UPI();
        checkout.processPayment(payment, 2500);

        payment = new PayPal();
        checkout.processPayment(payment, 3000);
    }
}
