package _Test2._04_decorator;

public class ExpressDelivery extends DeliveryDecorator {

    public ExpressDelivery(AbstractDelivery abstractDelivery) {
        super(abstractDelivery);
    }

    public void setExpressDelivery() {
        setDeliveryTimeInDays(1);
        System.out.println("Express delivery in progress...! Arrive in " + getDeliveryTimeInDays() + " day!");
    }

    @Override
    public void deliver() {
        setExpressDelivery();
    }
}
