package _06_Adapter;

public class BusToTrainClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem{
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        super.reservedSeat();
    }
}