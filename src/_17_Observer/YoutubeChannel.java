package _17_Observer;

public class YoutubeChannel extends Observable {
    private String name;

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public void uploadVideo(String title) {
        sendNotification(name + " uploaded: " + title);
    }
}
