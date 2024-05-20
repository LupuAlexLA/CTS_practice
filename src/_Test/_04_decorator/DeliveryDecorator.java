package _Test._04_decorator;

public abstract class DeliveryDecorator extends AbstractDelivery {
    protected AbstractDelivery abstractDelivery;

    public DeliveryDecorator(AbstractDelivery abstractDelivery) {
        this.abstractDelivery = abstractDelivery;
    }
    //?
    @Override
    public int getDeliveryTimeInDays() {
        return super.getDeliveryTimeInDays();
    }
    //?
    @Override
    public void setDeliveryTimeInDays(int deliveryTimeInDays) {
        super.setDeliveryTimeInDays(deliveryTimeInDays);
    }

    @Override
    public void deliver() {
        abstractDelivery.deliver();
    }
}
