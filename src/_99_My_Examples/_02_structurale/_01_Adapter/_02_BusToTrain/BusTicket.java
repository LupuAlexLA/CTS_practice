package _99_My_Examples._02_structurale._01_Adapter._02_BusToTrain;

public class BusTicket implements IBusTicket {
    private int noSeats = 50;
    private int noSeatsReserved = 0;

    @Override
    public void reservedSeat() {
        if(noSeatsReserved < noSeats) {
            System.out.println("Seats reserved");
        }
        else {
            System.out.println("The buss is full");
        }
    }
}
