package test2_something_else.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> membrii = new ArrayList<>();

    public void aboneaza(Observer observer) {
        membrii.add(observer);
    }

    public void dezaboneaza(Observer observer) {
        membrii.remove(observer);
    }

    public void sendNotifications(String message) {
        for (Observer o : membrii) {
            o.pushNotifications(message);
        }
    }
}
