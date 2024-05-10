package test2.strategy;

public class Comfort implements Mode {
    public final int stockHp = 500;
    @Override
    public int changeHp() {
        System.out.println("The car is on comfort!");
        return stockHp - 100;
    }
}
