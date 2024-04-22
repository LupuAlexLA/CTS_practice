package seminar10.decorator;

// abstracta pt ca sa nu fie folosita direct
// si pt a nu fi instantiata
public abstract class CarDecorator implements Vehicle {
    private Vehicle vehicle;

    // injectez in ctor vehicolul care va fi decorat
    public CarDecorator(Vehicle vehicle) {
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
