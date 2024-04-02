package lastShot.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        byte[] stream = new byte[] {1, 2, 3};
        Broadcast broadcast = new Broadcast("emisiune", stream);

        Broadcast clone1 = (Broadcast) broadcast.clone();
        Broadcast clone2 = (Broadcast) broadcast.clone();
        Broadcast clone3 = (Broadcast) broadcast.clone();

        clone1.addComment("wow");
        clone2.addComment("ce tare");
        clone3.addComment("bleah");

        System.out.println(clone1.getComments());
        System.out.println(clone2.getComments());
        System.out.println(clone3.getComments());
    }
}
