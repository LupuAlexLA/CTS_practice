package seminar10.chain;

public abstract class CallCenterHandler {
    protected CallCenterHandler nextHandler; // o sa l accesam din clasa derivata si sa nu i mai fac getteri

    public void setNextHandler(CallCenterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void refund(float sum);
}
