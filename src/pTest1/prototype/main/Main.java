package pTest1.prototype.main;

import pTest1.prototype.classes.BroadcastLive;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        byte[] stream = new byte[] {1, 2, 3};
        BroadcastLive original = new BroadcastLive("Romanii au talent", stream);

        BroadcastLive clone1 = (BroadcastLive) original.clone();
        BroadcastLive clone2 = (BroadcastLive) original.clone();
        BroadcastLive clone3 = (BroadcastLive) original.clone();

        clone1.addComment("Wow! ce tare!");
        clone2.addComment("Ce frumos!");
        clone3.addComment("Nu am vazut asa ceva!");

        System.out.println(clone1.getComments());
        System.out.println(clone2.getComments());
        System.out.println(clone3.getComments());
    }
}
