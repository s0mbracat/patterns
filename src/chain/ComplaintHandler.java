package chain;

public class ComplaintHandler extends Handler {
    protected boolean canHandle(String request) {
        return request.contains("жалоба");
    }

    protected void process(String request) {
        System.out.println("Жалоба: " + request);
    }
}
