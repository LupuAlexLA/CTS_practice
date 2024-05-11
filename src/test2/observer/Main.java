package test2.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Mentorul Digital");

        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        channel.subcribe(subscriber1);
        channel.subcribe(subscriber2);

        channel.setLatestVideo("Fisiere si Structuri");
        channel.publishNewVideo();

        channel.unsubscribe(subscriber2);

        channel.setLatestVideo("Lista Simpla");
        channel.publishNewVideo();
    }
}
