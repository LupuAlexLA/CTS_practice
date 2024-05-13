package test2.comportamentale.chain;

public abstract class InsuranceHandler {
    protected InsuranceHandler nextHandler;

    public void setNextHandler(InsuranceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void compensation(double amount);
}
