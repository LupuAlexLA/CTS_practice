package _99_My_Examples._02_structurale._04_Decorator._02_Car;

public class Main {
    public static void main(String[] args) {
        IVehicle vehicle = new Car();
        CarWithAlarm carWithAlarm = new CarWithAlarm(vehicle);
        carWithAlarm.stop();

        CarWithSportSeats carWithAlarmAndSportSeats = new CarWithSportSeats(carWithAlarm);
        carWithAlarmAndSportSeats.setSeatsProducer("Recaro");

        System.out.println(carWithAlarmAndSportSeats.getSeatsProducer());
        carWithAlarmAndSportSeats.stop();
    }
}
