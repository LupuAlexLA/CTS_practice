package test2.strategy;

public class Sport implements Mode {
    public final int stockHp = 500;
    @Override
    public int changeHp() {
        System.out.println("The car is on sport!");
        return stockHp + 200;
    }
}
