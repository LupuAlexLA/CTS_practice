package _99_My_Examples._03_comportamentale._03_State;

public class SelectProductState implements ShoppingCartState {
    @Override
    public void display() {
        System.out.println("Please select product!");
    }
}
