package _Test._04_decorator;

public class ExpressDelivery extends DeliveryDecorator {
    public ExpressDelivery(AbstractDelivery abstractDelivery) {
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

    @Override
    public void deliver() {
        setDeliveryTimeInDays(1);
        System.out.println("Delivering in " + getDeliveryTimeInDays() + " day");
    }
}
