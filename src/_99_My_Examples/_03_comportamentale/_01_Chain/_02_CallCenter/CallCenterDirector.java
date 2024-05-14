package _99_My_Examples._03_comportamentale._01_Chain._02_CallCenter;

public class CallCenterDirector extends CallCenterHandle {
    @Override
    public void refund(double sum) {
        if (sum > 500) {
            System.out.println("director ...");
        }
        else {
            if(nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
