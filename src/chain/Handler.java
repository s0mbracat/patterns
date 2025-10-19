package chain;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(String request) {
        if (canHandle(request)) process(request);
        else if (next != null) next.handle(request);
    }

    protected abstract boolean canHandle(String request);

    protected abstract void process(String request);
}
