package test2.command;

public class PizzaOrder implements FoodOrder {
    private Chef chef;

    public PizzaOrder(Chef chef) {
        this.chef = chef;
    }

    // incapsularea / comanda
    @Override
    public void cook() {
        chef.cookPizza();
    }
}
