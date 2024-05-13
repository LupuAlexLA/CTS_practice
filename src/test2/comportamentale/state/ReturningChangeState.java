package test2.comportamentale.state;

public class ReturningChangeState implements VendingMachineState {
    @Override
    public void doAction() {
        System.out.println("Please pickup the change!");
    }
}
