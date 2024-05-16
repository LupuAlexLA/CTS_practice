package _99_My_Examples._02_structurale._01_Adapter._02_BusToTrain;

public class BusToTrainClsAdapter extends BusTicket implements ITrainTicket {
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        super.reservedSeat();
    }
}
