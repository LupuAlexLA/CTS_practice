package _99_My_Examples._02_structurale._01_Adapter._02_BusToTrain;

public class Main {
    public static void main(String[] args) {
        // Bus
        IBusTicket busTicket = new BusTicket();
        busTicket.reservedSeat();

        // Train
        ITrainTicket trainTicket = new TrainTicket();
        trainTicket.buyTicket(3, 47);

        // Object Adapter
        BusToTrainObjAdapter objAdapter = new BusToTrainObjAdapter(busTicket);
        objAdapter.buyTicket(5, 100);

        // Class Adapter
        BusToTrainClsAdapter clsAdapter = new BusToTrainClsAdapter();
        clsAdapter.buyTicket(1, 1);
    }
}
