package _14_State;

public class DeliverProductState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("Delivering product");
    }
}
