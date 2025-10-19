package decorator;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee c) {
        super(c);
    }

    public String getDesc() {
        return coffee.getDesc() + " + сахар";
    }

    public double getCost() {
        return coffee.getCost() + 10;
    }
}
