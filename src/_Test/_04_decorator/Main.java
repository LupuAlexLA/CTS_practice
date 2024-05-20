package _Test._04_decorator;

public class Main {
    public static void main(String[] args) {
        AbstractDelivery delivery = new Delivery();
        delivery.setDeliveryTimeInDays(3);
        delivery.deliver();

        System.out.println();

        ExpressDelivery expressDelivery = new ExpressDelivery(delivery);
        expressDelivery.deliver();

        System.out.println();

        TwoReceiversDelivery twoReceiversDelivery = new TwoReceiversDelivery(expressDelivery);
        twoReceiversDelivery.setReceiver("Ionel");
        twoReceiversDelivery.setSecondReceiver("Gigel");
        twoReceiversDelivery.deliver();

        System.out.println();

        TwoReceiversDelivery twoReceiversDelivery2 = new TwoReceiversDelivery(delivery);
        twoReceiversDelivery2.setReceiver("Dorel");
        twoReceiversDelivery2.setSecondReceiver("Mihael");
        twoReceiversDelivery2.deliver();
    }
}
