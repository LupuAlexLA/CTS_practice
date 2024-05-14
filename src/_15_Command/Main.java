package _15_Command;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new BurgerOrder(chef));

        waiter.sendOrders();
    }
}
