package practiceInainteDeTest1._00_Examene._01_Creationale.T05_factoryMethod.classes;

public interface AbstractSubscriptionFactory {
    Subscription createSubscription(String type) throws InvalidSubscriptionException;
}
