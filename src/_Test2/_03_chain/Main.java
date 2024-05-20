package _Test2._03_chain;

public class Main {
    public static void main(String[] args) {
        MicrobusDeliver microbusDeliver = new MicrobusDeliver();
        TruckDeliver truckDeliver = new TruckDeliver();
        CourierDeliver courierDeliver = new CourierDeliver();

        microbusDeliver.setNextHandler(truckDeliver);
        truckDeliver.setNextHandler(courierDeliver);

        microbusDeliver.handleRequest("local");
        System.out.println(microbusDeliver.getDestinationBasedOnBarcode());

        System.out.println();

        microbusDeliver.handleRequest("deposit");
        System.out.println(microbusDeliver.getDestinationBasedOnBarcode());

        System.out.println();

        microbusDeliver.handleRequest("receiver");
        System.out.println(microbusDeliver.getDestinationBasedOnBarcode());

        System.out.println();

        microbusDeliver.handleRequest("something else");
        System.out.println(microbusDeliver.getDestinationBasedOnBarcode()); // de revenit aici pt ca da receiver in loc de error
    }
}
