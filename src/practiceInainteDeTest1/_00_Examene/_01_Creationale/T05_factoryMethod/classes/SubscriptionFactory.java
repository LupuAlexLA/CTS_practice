package practiceInainteDeTest1._00_Examene._01_Creationale.T05_factoryMethod.classes;

public class SubscriptionFactory implements AbstractSubscriptionFactory {
    @Override
    public Subscription createSubscription(String type) throws InvalidSubscriptionException {
        switch (type) {
            case "X" -> {
                return new MobilityX();
            }
            case "Y" -> {
                return new MobilityY();
            }
            case "Z" -> {
                return new MobilityZ();
            }
            default -> throw new InvalidSubscriptionException();
        }
    }
}
