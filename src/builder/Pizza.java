package builder;

public class Pizza {
    private String dough, sauce, topping;

    private Pizza(Builder b) {
        dough = b.dough;
        sauce = b.sauce;
        topping = b.topping;
    }

    public String toString() {
        return "Пицца[" + dough + ", " + sauce + ", " + topping + "]";
    }

    public static class Builder {
        private String dough, sauce, topping;

        public Builder setDough(String d) {
            dough = d;
            return this;
        }

        public Builder setSauce(String s) {
            sauce = s;
            return this;
        }

        public Builder setTopping(String t) {
            topping = t;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
