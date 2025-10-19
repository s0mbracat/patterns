package proxy;

public class RealImage implements Image {
    private String file;

    public RealImage(String f) {
        file = f;
        load();
    }

    private void load() {
        System.out.println("Загрузка " + file);
    }

    public void display() {
        System.out.println("Просмотр " + file);
    }
}
