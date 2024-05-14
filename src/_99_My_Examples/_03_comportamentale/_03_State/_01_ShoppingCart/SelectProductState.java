package _99_My_Examples._03_comportamentale._03_State._01_ShoppingCart;

public class SelectProductState implements ShoppingCartState {
    @Override
    public void display() {
        System.out.println("Please select product!");
    }
}
