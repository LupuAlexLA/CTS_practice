package _99_My_Examples._03_comportamentale._06_Observer._02_Youtube;

public class Channel extends Observable {
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public void uploadVideo(String title) {
        super.sendNotification(name + " uploaded " + title);
    }
}
