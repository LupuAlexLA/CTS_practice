package _99_My_Examples._03_comportamentale._05_Command._02_restaurant;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        waiter.addOrderToList(new PizzaOrder(chef));
        waiter.addOrderToList(new BurgerOrder(chef));

        waiter.sendOrders();
    }
}
