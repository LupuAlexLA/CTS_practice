package _06_Adapter;

public class Main {
    public static void main(String[] args) {
        AbstractTrainTicketingSystem trainTicketingSystem = new TrainTicketingSystem();
        trainTicketingSystem.buyTicket(3, 34);
        AbstractBusTicketingSystem busTicketingSystem = new BusTicketingSystem();
        busTicketingSystem.reservedSeat();

        trainTicketingSystem = new BusToTrainObjectAdapter(
                busTicketingSystem);
        trainTicketingSystem.buyTicket(2, 56);

        trainTicketingSystem = new BusToTrainClassAdapter();
        trainTicketingSystem.buyTicket(1, 85);
    }
}
