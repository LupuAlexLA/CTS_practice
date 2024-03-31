package _00_Test1.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        byte[] stream = new byte[] {1,2,3};
        Broadcast broadcast = new Broadcast("RAT", stream);

        Broadcast clona1 = (Broadcast) broadcast.clone();
        Broadcast clona2 = (Broadcast) broadcast.clone();
        Broadcast clona3 = (Broadcast) broadcast.clone();

        clona1.addComment("WOW");
        clona2.addComment("Super");
        clona3.addComment("Frumos");

        System.out.println(clona1.getComments());
        System.out.println(clona2.getComments());
        System.out.println(clona3.getComments());
    }
}
