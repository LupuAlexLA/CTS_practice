package test2.comportamentale.observer;

public class Subscriber implements Observer {
    @Override
    public void pushNotifications(String message) {
        System.out.println(message);
    }
}
