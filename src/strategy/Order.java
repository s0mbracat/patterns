package strategy;

public class Order {
    private Payment payment;

    public void setPayment(Payment p) {
        payment = p;
    }

    public void checkout(int amount) {
        if (payment != null) payment.pay(amount);
    }
}
