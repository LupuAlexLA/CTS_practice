package _17_Observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("Recorder");

        YoutubeSubscriber subscriber1 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber1);

        YoutubeSubscriber subscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber2);

        youtubeChannel.uploadVideo("Cartelul din Carpati");

        youtubeChannel.unsubscribe(subscriber2);

        youtubeChannel.uploadVideo("Marele Alb");
    }
}
