package _99_My_Examples._02_structurale._04_Decorator._02_Car;

public class CarWithAlarm extends CarDecorator {
    public CarWithAlarm(IVehicle vehicle) {
        super(vehicle);
    }

    public void activateAlarm() {
        System.out.println("Alarm is on");
    }

    @Override
    public void stop() {
        super.stop();
        activateAlarm();
    }
}
