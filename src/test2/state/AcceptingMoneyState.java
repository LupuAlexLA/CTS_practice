package test2.state;

public class AcceptingMoneyState implements VendingMachineState {
    @Override
    public void doAction() {
        System.out.println("Please input money!");
    }
}
