package _11_Decorator;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        // at cd vreau sa fol met claselor decorate tre sa am ref la clasele respective
        // Vehicle carWithAlarm = new CarWithAlarm(car); // nu merge linia 14
        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeatsAndAlarm = new CarWithSportSeats(carWithAlarm);
        carWithSportSeatsAndAlarm.setSeatProducer("Recaro");
        System.out.println(carWithSportSeatsAndAlarm.getSeatProducer());
        carWithSportSeatsAndAlarm.stop();
    }
}
