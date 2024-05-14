package _99_My_Examples._03_comportamentale._06_Observer._02_Youtube;

public class Subscriber implements Observer {
    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }
}
