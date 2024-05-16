package _99_My_Examples._02_structurale._01_Adapter._02_BusToTrain;

public class BusToTrainObjAdapter implements ITrainTicket {
    private IBusTicket busTicket;

    public BusToTrainObjAdapter(IBusTicket busTicket) {
        this.busTicket = busTicket;
    }

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        busTicket.reservedSeat();
    }
}
