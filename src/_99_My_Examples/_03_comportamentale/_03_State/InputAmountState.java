package _99_My_Examples._03_comportamentale._03_State;

public class InputAmountState implements ShoppingCartState {
    @Override
    public void display() {
        System.out.println("Please input amount!");
    }
}
