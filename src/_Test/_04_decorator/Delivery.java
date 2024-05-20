package _Test._04_decorator;

public class Delivery extends AbstractDelivery {
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
        System.out.println("Delivery in progress... " + getDeliveryTimeInDays() + " days");
    }
}
