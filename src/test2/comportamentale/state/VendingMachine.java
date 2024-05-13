package test2.comportamentale.state;

public class VendingMachine {
    private VendingMachineState state;
    private double amount;
    private double change;

    // setam din ctor ca starea e AcceptingMoney sa fie by default (prima) e singura setata din ext.
    public VendingMachine() {
        state = new AcceptingMoneyState();
        state.doAction();
    }

    // folosit ca sa pot eventual din exterior sa schimb strategia (nu e obligatoriu)
    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void inputMoney(double amount) {
        this.amount = amount;
        setState(new ProductSelectionState());
        state.doAction();
    }

    public void selectProduct(double price) {
        if(price <= amount) {
            change = amount - price;
            setState(new DeliveringProductState());
            state.doAction();
            setState(new ReturningChangeState());
            state.doAction();
            System.out.println("Change: " + change);
        }
        else {
            setState(new AcceptingMoneyState());
            state.doAction();
        }
    }
}
