package chain;

public class GeneralHandler extends Handler {
    protected boolean canHandle(String request) {
        return true;
    }

    protected void process(String request) {
        System.out.println("Общее: " + request);
    }
}
