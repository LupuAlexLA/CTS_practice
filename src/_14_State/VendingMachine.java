package _14_State;

public class VendingMachine {
    private VendingMachineState state;

    private double balance;
    private double change;

    public VendingMachine() {
        state = new InputMoneyState();
        state.display();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void addMoney(double sum) {
        this.balance += sum;
        setState(new SelectProductState()); // sau state = new SelectProductState() nu are sens in prima varianta cu set
        state.display();
    }

    public void buyProduct(double price) {
        if (price <= balance) {
            state = new DeliverProductState();
            state.display();
            if(price < balance) {
                state = new ReturnChangeState();
                state.display();
            }
            balance = 0;
        }
        else {
            state = new InputMoneyState();
            state.display();
        }
    }
}
