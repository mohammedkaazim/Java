interface Payment {
    void makePayment(double amount);
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card 💳");
    }
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI 📲");
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.makePayment(1500);
        p2.makePayment(800);
    }
}
