package _06_Adapter;

public class BusToTrainObjectAdapter implements AbstractTrainTicketingSystem{
    private AbstractBusTicketingSystem busTicketingSystem;

    public BusToTrainObjectAdapter(AbstractBusTicketingSystem busTicketingSystem) {
        this.busTicketingSystem = busTicketingSystem;
    }

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        busTicketingSystem.reservedSeat();
    }

}