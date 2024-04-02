package _00_RecapTest.factory.classes;

public class OptionY implements Subscription {
    OptionY() {

    }
    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * 12;
    }
}
