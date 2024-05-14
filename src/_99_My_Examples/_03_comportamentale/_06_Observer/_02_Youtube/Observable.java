package _99_My_Examples._03_comportamentale._06_Observer._02_Youtube;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void sendNotification(String message) {
        for(Observer o : subscribers) {
            o.receiveNotification(message);
        }
    }
}
