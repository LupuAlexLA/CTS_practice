package _Test2._04_decorator;

public abstract class DeliveryDecorator extends AbstractDelivery {
    private AbstractDelivery abstractDelivery;

    public DeliveryDecorator(AbstractDelivery abstractDelivery) {
        this.abstractDelivery = abstractDelivery;
    }

    @Override
    public void deliver() {
        abstractDelivery.deliver();
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return this.receiver;
    }
}
