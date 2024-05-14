package _99_My_Examples._03_comportamentale._03_State._02_VendingMachine;

public class PickupProductState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("pick up the product...");
    }
}
