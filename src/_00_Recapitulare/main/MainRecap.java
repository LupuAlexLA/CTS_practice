package _00_Recapitulare.main;

import _00_Recapitulare.classes.Car;
import _00_Recapitulare.classes.Engine;
import _00_Recapitulare.classes.EngineType;
import _00_Recapitulare.interfaces.Tunable;

public class MainRecap {
    public static void main(String[] args) {
        Car car = new Car();
        car.setProducer("VW");
        car.printDetails();

        Engine engine = new Engine();
        engine.setPower(200);
        engine.setEngineType(EngineType.AXX);
        car.setEngine(engine);
        car.setPrice(30000);

        System.out.println(car.computeFinalPrice());
        System.out.println(car.upgradeStage());

        Tunable t = car;
        System.out.println(t.isTunable());
    }
}
