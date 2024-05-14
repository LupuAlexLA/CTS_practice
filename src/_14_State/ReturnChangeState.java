package _14_State;

public class ReturnChangeState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("Please pick up the change");
    }
}
