package _99_My_Examples._03_comportamentale._03_State;

public class ShoppingCart {
    private ShoppingCartState state;

    private double balance;
    private double change;

    public ShoppingCart() {
        state = new InputAmountState();
        state.display();
    }

    public void setState(ShoppingCartState state) {
        this.state = state;
    }

    public void addMoney(double amount) {
        this.balance += amount;
        state = new SelectProductState();
        state.display();
    }

    public void buyProduct(double price) {
        if(price <= balance) {
            state = new InsertProductInCartState();
            state.display();

            if (price < balance) {
                state = new ReturnChangeState();
                state.display();
            }
            balance = 0;
        }
        else {
            state = new InputAmountState();
            state.display();
        }
    }
}
