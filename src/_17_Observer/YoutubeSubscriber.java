package _17_Observer;

public class YoutubeSubscriber implements Observer {
    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }
}