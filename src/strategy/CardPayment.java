package strategy;

public class CardPayment implements Payment {
    private String card;

    public CardPayment(String card) {
        this.card = card;
    }

    public void pay(int amount) {
        System.out.println("Оплата картой " + card + ": " + amount + " руб.");
    }
}
