package _07_Facade;

public class Main {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.start();
        carFacade.emergencyBrake();
        carFacade.park();
    }
}
