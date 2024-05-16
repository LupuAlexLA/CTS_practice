package _99_My_Examples._02_structurale._04_Decorator._02_Car;

public class CarWithSportSeats extends CarDecorator {
    private String seatsProducer;

    public String getSeatsProducer() {
        return seatsProducer;
    }

    public void setSeatsProducer(String seatsProducer) {
        this.seatsProducer = seatsProducer;
    }

    public CarWithSportSeats(IVehicle vehicle) {
        super(vehicle);
    }
}
