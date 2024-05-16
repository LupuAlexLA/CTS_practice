package _99_My_Examples._02_structurale._04_Decorator._02_Car;

public class Car implements IVehicle {
    private int power;
    private String producer;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void start() {
        System.out.println("the car is moving");
    }

    @Override
    public void stop() {
        System.out.println("the car has stopped");
    }
}
