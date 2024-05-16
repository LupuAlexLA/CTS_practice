package _99_My_Examples._02_structurale._04_Decorator._01_Car;

public class BodyDecorator extends CarDecorator {

    public BodyDecorator(IVehicle vehicle) {
        super(vehicle);
    }

    public void raiseEleron() {
        System.out.println("The eleron is up!");
    }

    @Override
    public void stop() {
        super.stop();
        raiseEleron();
    }
}
