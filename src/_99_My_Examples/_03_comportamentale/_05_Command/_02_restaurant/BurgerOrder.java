package _99_My_Examples._03_comportamentale._05_Command._02_restaurant;

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
