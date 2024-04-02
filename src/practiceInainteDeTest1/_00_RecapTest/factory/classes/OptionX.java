package practiceInainteDeTest1._00_RecapTest.factory.classes;

public class OptionX implements Subscription {
    OptionX() {

    }
    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * 12;
    }
}
