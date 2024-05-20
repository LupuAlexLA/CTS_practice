package _Test2._04_decorator;

public class Main {
    public static void main(String[] args) {
        AbstractDelivery delivery = new Delivery();
        delivery.setDeliveryTimeInDays(3);
        delivery.deliver();

        System.out.println();

        ExpressDelivery expressDelivery = new ExpressDelivery(delivery);
        expressDelivery.deliver();

        System.out.println();

        TwoSendersDelivery twoSendersDelivery = new TwoSendersDelivery(delivery);
        twoSendersDelivery.setReceiver("Ionel");
        twoSendersDelivery.setSecondReceiver("Gigel");
        twoSendersDelivery.deliver();

        System.out.println();

        TwoSendersDelivery twoSendersExpressdelivery = new TwoSendersDelivery(expressDelivery);
        twoSendersExpressdelivery.setReceiver("Dorel");
        twoSendersExpressdelivery.setSecondReceiver("Bobel");
        twoSendersDelivery.deliver();
    }
}
