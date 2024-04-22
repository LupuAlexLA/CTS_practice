package _09_Composite.vers1_simple;

public interface Receiver {
    void receive(String message);
    void addReceiver(Receiver receiver);
    void removeReceiver(Receiver receiver);
    Receiver getReceiver(int position);
}
