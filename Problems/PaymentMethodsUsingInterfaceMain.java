interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

class Checkout {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class PaymentMethodsUsingInterfaceMain {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        Payment payment1 = new CreditCard();
        checkout.processPayment(payment1, 5000);

        Payment payment2 = new UPI();
        checkout.processPayment(payment2, 2500);

        Payment payment3 = new PayPal();
        checkout.processPayment(payment3, 3000);
    }
}