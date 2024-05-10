package _12_Chain;

public abstract class CallCenterHandler {
    protected CallCenterHandler nextHandler; // o sa l accesam din clasa derivata si sa nu i mai fac getteri
    // din afara clasei, am nevoie doar sa setez handlerul nu sa il gasesc
    // => (protected si doar setter) sau (campul private si getter si setter)
    // mai elegant prima varianta ca sa nu apelez getter-ul de 2 ori
    public void setNextHandler(CallCenterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void refund(float sum);
}
