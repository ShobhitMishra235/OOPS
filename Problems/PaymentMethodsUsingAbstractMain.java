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
