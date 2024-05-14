package _15_Command;

public class BurgerOrder implements FoodOrder {
    private Chef chef;

    public BurgerOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void prepare() {
        chef.makeBurger();
    }
}
