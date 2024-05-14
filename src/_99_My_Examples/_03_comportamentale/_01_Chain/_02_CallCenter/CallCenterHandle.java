package _99_My_Examples._03_comportamentale._01_Chain._02_CallCenter;

public abstract class CallCenterHandle {
    protected CallCenterHandle nextHandler;

    public void setNextHandler(CallCenterHandle nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void refund(double sum);
}
