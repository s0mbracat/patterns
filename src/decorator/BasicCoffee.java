package decorator;

public class BasicCoffee implements Coffee {
    public String getDesc() {
        return "Кофе";
    }

    public double getCost() {
        return 100;
    }
}
