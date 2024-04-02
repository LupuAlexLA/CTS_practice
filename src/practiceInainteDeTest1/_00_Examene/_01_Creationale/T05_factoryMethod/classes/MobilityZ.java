package practiceInainteDeTest1._00_Examene._01_Creationale.T05_factoryMethod.classes;

public class MobilityZ implements Subscription {
    public MobilityZ() {
    }

    @Override
    public float totalCosts(int durationInMonths) {
        float pret = 30;
        return pret * durationInMonths;
    }
}
