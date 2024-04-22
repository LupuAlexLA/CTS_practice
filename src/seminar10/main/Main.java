package seminar10.main;

import seminar10.chain.CallCenterHandler;
import seminar10.chain.CallCenterManager;
import seminar10.chain.CallCenterOfficer;
import seminar10.chain.CallCenterOperator;
import seminar10.decorator.Car;
import seminar10.decorator.CarWithAlarm;
import seminar10.decorator.CarWithSportSeats;
import seminar10.decorator.Vehicle;
import seminar10.strategy.*;

public class Main {
    public static void main(String[] args) {
        // DECORATOR
        Vehicle car = new Car();
        // at cd vreau sa fol met claselor decorate tre sa am ref la clasele respective
        // Vehicle carWithAlarm = new CarWithAlarm(car); // nu merge linia 14
        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeatsAndAlarm = new CarWithSportSeats(carWithAlarm);
        carWithSportSeatsAndAlarm.setSeatProducer("Recaro");
        System.out.println(carWithSportSeatsAndAlarm.getSeatProducer());
        carWithSportSeatsAndAlarm.stop();

        // COR
        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler officer = new CallCenterOfficer();
        CallCenterHandler manager = new CallCenterManager();
        operator.setNextHandler(officer);
        officer.setNextHandler(manager);
        operator.refund(50);
        operator.refund(200);
        operator.refund(700);

        // SRATEGY
        Calculator calculator = new Calculator();
        Operation operation = new SumOperation();
        calculator.setOperation(operation);
        try {
            System.out.println(calculator.compute(1, 2, 3, 4, 5));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }

        operation = new ProductOperation();
        calculator.setOperation(operation);
        try {
            System.out.println(calculator.compute(1, 2, 3, 4, 5));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }

        // orice clasa care acc ca param o metoda lambda e de fapt o implementare de strategy
        calculator.setOperation(l -> {
            double result = l.get(0);
            for(int i = 1; i < l.size(); i++)
                result = Math.pow(result, l.get(i));
            return result;
        });
        try {
            System.out.println(calculator.compute(2, 3, 4));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
