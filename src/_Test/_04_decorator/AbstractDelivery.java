package _Test._04_decorator;

public abstract class AbstractDelivery {
    protected String sender;
    protected String receiver;
    private int deliveryTimeInDays;

    public int getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public void setDeliveryTimeInDays(int deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    public abstract void deliver();
}
