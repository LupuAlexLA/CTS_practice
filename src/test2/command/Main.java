package test2.command;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        waiter.addOrder(new PizzaOrder(chef));
        waiter.addOrder(new PastaOrder(chef));
        waiter.addOrder(new BurgerOrder(chef));

        waiter.sendOrders();
    }
}
