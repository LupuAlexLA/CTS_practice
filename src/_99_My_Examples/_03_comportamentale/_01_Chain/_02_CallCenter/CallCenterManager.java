package _99_My_Examples._03_comportamentale._01_Chain._02_CallCenter;

public class CallCenterManager extends CallCenterHandle {
    @Override
    public void refund(double sum) {
        if (sum < 500) {
            System.out.println("manager ...");
        }
        else {
            if(nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
