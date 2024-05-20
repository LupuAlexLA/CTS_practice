package _Test._04_decorator;

public class TwoReceiversDelivery extends DeliveryDecorator {
    private String secondReceiver;
    public TwoReceiversDelivery(AbstractDelivery abstractDelivery) {
        super(abstractDelivery);
    }

    @Override
    public int getDeliveryTimeInDays() {
        return super.getDeliveryTimeInDays();
    }

    @Override
    public void setDeliveryTimeInDays(int deliveryTimeInDays) {
        super.setDeliveryTimeInDays(deliveryTimeInDays);
    }

    public void setSecondReceiver(String secondReceiver) {
        this.secondReceiver = secondReceiver;
    }

    public String getSecondReceiver() {
        return this.secondReceiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public void deliver() {
        super.deliver();
        System.out.println("Deliverd to " + receiver + " and " + getSecondReceiver());
    }
}
