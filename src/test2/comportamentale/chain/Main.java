package test2.comportamentale.chain;

public class Main {
    public static void main(String[] args) {
        InsuranceOperator operator = new InsuranceOperator();
        InsuranceManager manager = new InsuranceManager();
        InsuranceExecutive executive = new InsuranceExecutive();

        operator.setNextHandler(manager);
        manager.setNextHandler(executive);

        operator.compensation(1500);
        operator.compensation(3500);
        operator.compensation(6500);
        operator.compensation(15000);
    }
}
