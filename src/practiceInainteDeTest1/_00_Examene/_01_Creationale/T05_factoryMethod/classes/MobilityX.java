package practiceInainteDeTest1._00_Examene._01_Creationale.T05_factoryMethod.classes;

public class MobilityX implements Subscription {
    public MobilityX() {
    }

    @Override
    public float totalCosts(int durationInMonths) {
        float pret = 15;
        return pret * durationInMonths;
    }
}
