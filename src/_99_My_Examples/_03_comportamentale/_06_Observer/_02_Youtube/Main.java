package _99_My_Examples._03_comportamentale._06_Observer._02_Youtube;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("Mr Beast");

        Subscriber subscriber1 = new Subscriber();
        channel.subscribe(subscriber1);

        Subscriber subscriber2 = new Subscriber();
        channel.subscribe(subscriber2);

        channel.uploadVideo("Destroy 100 Tesla");

        channel.unSubscribe(subscriber2);

        channel.uploadVideo("Repair 100 Tesla");
    }
}
