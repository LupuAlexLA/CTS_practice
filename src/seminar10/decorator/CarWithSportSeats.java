package seminar10.decorator;

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
