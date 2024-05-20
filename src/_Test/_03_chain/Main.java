package _Test._03_chain;

public class Main {
    public static void main(String[] args) {
        Microbus microbus = new Microbus();
        Truck truck = new Truck();
        Courier courier = new Courier();

        microbus.setNextHandler(truck);
        truck.setNextHandler(courier);

        microbus.handleRequest("local");
        System.out.println(microbus.getDestinationBasedOnBarcode());

        System.out.println();

        microbus.handleRequest("deposit");
        System.out.println(microbus.getDestinationBasedOnBarcode());

        System.out.println();

        microbus.handleRequest("receiver");
        System.out.println(microbus.getDestinationBasedOnBarcode());

        System.out.println();

        microbus.handleRequest("something else");
        System.out.println(microbus.getDestinationBasedOnBarcode());
    }
}
