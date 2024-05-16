package _99_My_Examples._02_structurale._04_Decorator._01_Car;

public class Main {
    public static void main(String[] args) {
        IVehicle car = new Car("BMW", 400);
        BodyDecorator carWithEleron = new BodyDecorator(car);
        carWithEleron.raiseEleron();

        ChipTunningDecorator carWithEleronAndStage = new ChipTunningDecorator(carWithEleron);
        carWithEleronAndStage.setSurplusHp(100);
        System.out.println(carWithEleronAndStage.getSurplusHp());
        carWithEleronAndStage.stop();
    }
}
