package _99_My_Examples._03_comportamentale._03_State._02_VendingMachine;

public class AcceptingMoneyState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("input money...");
    }
}
