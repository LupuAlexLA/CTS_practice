package _09_Composite.vers1_simple;

public class EmailAddress implements Receiver {
    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public void receive(String message) {
        System.out.println(address + ": " + message);
    }

    @Override
    public void addReceiver(Receiver receiver) {
        throw new UnsupportedOperationException(); // RE - > unchecked (nu esti ob sa faci catch sau throws); E -> checked;
    }

    @Override
    public void removeReceiver(Receiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Receiver getReceiver(int position) {
        throw new UnsupportedOperationException();
    }
}
