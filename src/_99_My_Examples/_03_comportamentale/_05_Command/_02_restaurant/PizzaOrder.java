package _99_My_Examples._03_comportamentale._05_Command._02_restaurant;

public class PizzaOrder implements FoodOrder {
    private Chef chef;

    public PizzaOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void prepare() {
        chef.makePizza();
    }
}
