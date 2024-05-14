package _99_My_Examples._03_comportamentale._03_State._02_VendingMachine;

public class ReturningChangeState implements VendingMachineState {
    @Override
    public void display() {
        System.out.println("returning change...");
    }
}
