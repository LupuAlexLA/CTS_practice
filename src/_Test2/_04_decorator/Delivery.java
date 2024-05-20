package _Test2._04_decorator;

public class Delivery extends AbstractDelivery {
    private String sender;
    private String receiver;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void deliver() {
        System.out.println("Delivery in progres... " + getDeliveryTimeInDays() + " days");
    }
}
