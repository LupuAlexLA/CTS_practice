package practiceInainteDeTest1._00_RecapTest.factory.classes;

public class OptionZ implements Subscription {
    OptionZ() {

    }
    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * 12;
    }
}
