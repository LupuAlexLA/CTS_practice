package _99_My_Examples._03_comportamentale._03_State._01_ShoppingCart;

public class InsertProductInCartState implements ShoppingCartState {
    @Override
    public void display() {
        System.out.println("The selected product has been added to the shopping cart!");
    }
}
