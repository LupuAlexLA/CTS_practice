package _12_Chain;

public class Main {
    public static void main(String[] args) {
        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler officer = new CallCenterOfficer();
        CallCenterHandler manager = new CallCenterManager();
        operator.setNextHandler(officer);
        officer.setNextHandler(manager);
        operator.refund(50);
        operator.refund(200);
        operator.refund(700);
    }
}
