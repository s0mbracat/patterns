package decorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee c) {
        super(c);
    }

    public String getDesc() {
        return coffee.getDesc() + " + молоко";
    }

    public double getCost() {
        return coffee.getCost() + 30;
    }
}
