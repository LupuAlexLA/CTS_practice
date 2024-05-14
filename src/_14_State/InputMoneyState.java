package _14_State;

public class InputMoneyState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("Please input money");
    }
}
