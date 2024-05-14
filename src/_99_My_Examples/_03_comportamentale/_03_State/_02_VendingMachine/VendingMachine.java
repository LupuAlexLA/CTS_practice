package _99_My_Examples._03_comportamentale._03_State._02_VendingMachine;

public class VendingMachine {
    private VendingMachineState state;

    private int balance;
    private int change;

    public VendingMachine() {
        this.state = new AcceptingMoneyState();
        state.display();
    }

    public void addMoney(int amount) {
        this.balance += amount;
        this.state = new SelectProductState();
        state.display();
    }

    public void buyProduct(int sum) {
        if(sum <= balance) {
            this.state = new PickupProductState();
            state.display();
            if(sum < balance) {
                change = balance - sum;
                this.state = new ReturningChangeState();
                state.display();
            }
            balance = 0;
        }
        else {
            this.state = new AcceptingMoneyState();
            state.display();
        }
    }
}
