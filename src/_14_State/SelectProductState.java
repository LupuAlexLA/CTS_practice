package _14_State;

public class SelectProductState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("Please select product");
    }
}
