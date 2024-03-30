package _00_Examene._01_Creationale.T05_factoryMethod.classes;

public class MobilityY implements Subscription {
    public MobilityY() {
    }

    @Override
    public float totalCosts(int durationInMonths) {
        float pret = 20;
        return pret * durationInMonths;
    }
}
