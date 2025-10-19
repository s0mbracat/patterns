package strategy;

public class CashPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Оплата наличными: " + amount + " руб.");
    }
}
