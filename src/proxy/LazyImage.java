package proxy;

public class LazyImage implements Image {
    private String file;
    private RealImage real;

    public LazyImage(String f) {
        file = f;
    }

    public void display() {
        if (real == null) real = new RealImage(file);
        real.display();
    }
}
