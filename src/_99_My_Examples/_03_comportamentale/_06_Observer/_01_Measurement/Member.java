package _99_My_Examples._03_comportamentale._06_Observer._01_Measurement;

public class Member implements Observer {
    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }
}
