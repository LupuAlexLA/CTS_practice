package _99_My_Examples._02_structurale._05_Facade._01_Car;

public class CarFacade {
    Engine engine = new Engine();
    Suspension suspension = new Suspension();
    BoardClock boardClock = new BoardClock();

    public void sport() {
        System.out.println("Sport mode activated!");
        engine.setHp(engine.getHp() + 100);
        engine.setConsumption(engine.getConsumption() + 5);
        suspension.turnOnSport();
        boardClock.turnOnSport();
    }

    public void offRoad() {
        System.out.println("Off Road mode activated!");
        suspension.turnOnOffRoad();
        boardClock.turnOnOffRoad();
    }
}
