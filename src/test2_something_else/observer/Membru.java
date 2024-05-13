package test2_something_else.observer;

public class Membru implements Observer {
    @Override
    public void pushNotifications(String message) {
        System.out.println(message);
    }
}
