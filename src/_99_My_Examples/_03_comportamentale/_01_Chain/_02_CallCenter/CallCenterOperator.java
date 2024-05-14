package _99_My_Examples._03_comportamentale._01_Chain._02_CallCenter;

public class CallCenterOperator extends CallCenterHandle {
    @Override
    public void refund(double sum) {
        if (sum < 300) {
            System.out.println("operator ...");
        }
        else {
            if(nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
