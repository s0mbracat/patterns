package chain;

public class SpamHandler extends Handler {
    protected boolean canHandle(String request) {
        return request.contains("спам");
    }

    protected void process(String request) {
        System.out.println("Спам: " + request);
    }
}
