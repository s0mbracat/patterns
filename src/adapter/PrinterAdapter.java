package adapter;

public class PrinterAdapter implements NewPrinter {
    private OldPrinter old;

    public PrinterAdapter(OldPrinter o) {
        old = o;
    }

    public void print(String doc) {
        old.printText(doc);
    }
}
