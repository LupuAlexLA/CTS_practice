package test2.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> subscribers = new ArrayList<>();

    public void subcribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void sendNotifications(String message) {
        for (Observer observer : subscribers) {
            observer.pushNotifications(message);
        }
    }
}
