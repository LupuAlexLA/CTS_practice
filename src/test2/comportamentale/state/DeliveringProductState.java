package test2.comportamentale.state;

public class DeliveringProductState implements VendingMachineState {
    @Override
    public void doAction() {
        System.out.println("Please pick your product!");
    }
}
