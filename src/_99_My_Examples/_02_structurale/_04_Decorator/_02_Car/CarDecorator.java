package _99_My_Examples._02_structurale._04_Decorator._02_Car;

public class CarDecorator implements IVehicle {
    private IVehicle vehicle;

    public CarDecorator(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        vehicle.start();
    }

    @Override
    public void stop() {
        vehicle.stop();
    }
}
