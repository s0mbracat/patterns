import adapter.NewPrinter;
import adapter.OldPrinter;
import adapter.PrinterAdapter;
import builder.Pizza;
import chain.ComplaintHandler;
import chain.GeneralHandler;
import chain.Handler;
import chain.SpamHandler;
import decorator.BasicCoffee;
import decorator.Coffee;
import decorator.Milk;
import decorator.Sugar;
import proxy.Image;
import proxy.LazyImage;
import strategy.CardPayment;
import strategy.CashPayment;
import strategy.Order;

public class PatternDemo {
    public static void main(String[] args) {
        System.out.println("1. STRATEGY:");
        Order order = new Order();
        order.setPayment(new CardPayment("1234-5678"));
        order.checkout(500);

        order.setPayment(new CashPayment());
        order.checkout(300);

        System.out.println("\n2. CHAIN OF RESPONSIBILITY:");
        Handler chain = new SpamHandler();
        chain.setNext(new ComplaintHandler()).setNext(new GeneralHandler());

        chain.handle("это спам сообщение");
        chain.handle("это жалоба на сервис");
        chain.handle("обычное сообщение");

        System.out.println("\n3. BUILDER:");
        Pizza pizza = new Pizza.Builder()
                .setDough("тонкое")
                .setSauce("томатный")
                .setTopping("сыр")
                .build();
        System.out.println(pizza);

        System.out.println("\n4. PROXY:");
        Image img = new LazyImage("photo.jpg");
        img.display();
        img.display();

        System.out.println("\n5. DECORATOR:");
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDesc() + " = " + coffee.getCost() + " руб.");

        coffee = new Milk(coffee);
        System.out.println(coffee.getDesc() + " = " + coffee.getCost() + " руб.");

        coffee = new Sugar(coffee);
        System.out.println(coffee.getDesc() + " = " + coffee.getCost() + " руб.");

        System.out.println("\n6. ADAPTER:");
        NewPrinter printer = new PrinterAdapter(new OldPrinter());
        printer.print("Документ");
    }
}