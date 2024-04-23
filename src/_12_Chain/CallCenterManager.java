package _12_Chain;

public class CallCenterManager extends CallCenterHandler {
    @Override
    public void refund(float sum) {
        System.out.println("The manager processed the refund!");
    }
}
