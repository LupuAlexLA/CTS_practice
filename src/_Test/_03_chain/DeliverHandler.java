package _Test._03_chain;

public abstract class DeliverHandler implements AbstractBarcodeScanner {
    protected DeliverHandler nextHandler;
    protected String actualDestination;

    public void setNextHandler(DeliverHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String destination);
}
