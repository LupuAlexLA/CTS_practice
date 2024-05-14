package _99_My_Examples._03_comportamentale._01_Chain._02_CallCenter;

public class Main {
    public static void main(String[] args) {
        CallCenterOperator operator = new CallCenterOperator();
        CallCenterManager manager = new CallCenterManager();
        CallCenterDirector director = new CallCenterDirector();

        operator.setNextHandler(manager);
        manager.setNextHandler(director);

        operator.refund(200);
        operator.refund(400);
        operator.refund(700);
    }
}
