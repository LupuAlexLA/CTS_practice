package _Test2._04_decorator;

public class TwoSendersDelivery extends DeliveryDecorator {
    private String secondReceiver;

    public TwoSendersDelivery(AbstractDelivery abstractDelivery) {
        super(abstractDelivery);
    }

    public void setSecondReceiver(String secondReceiver) {
        this.secondReceiver = secondReceiver;
    }

    @Override
    public void setReceiver(String receiver) {
        super.setReceiver(receiver);
    }

    @Override
    public String getReceiver() {
        return super.getReceiver();
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("Delivery with 2 receiver! Contacts: " + getReceiver() + " and " + secondReceiver);
    }
}
