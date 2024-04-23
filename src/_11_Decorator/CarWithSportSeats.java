package _11_Decorator;

public class CarWithSportSeats extends CarDecorator {
    private String seatProducer;

    public String getSeatProducer() {
        return seatProducer;
    }

    public void setSeatProducer(String seatProducer) {
        this.seatProducer = seatProducer;
    }

    public CarWithSportSeats(Vehicle vehicle) {
        super(vehicle);
    }

}
