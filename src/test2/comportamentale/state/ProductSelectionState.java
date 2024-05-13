package test2.comportamentale.state;

public class ProductSelectionState implements VendingMachineState {
    @Override
    public void doAction() {
        System.out.println("Please your select your product 1-30!");
    }
}
