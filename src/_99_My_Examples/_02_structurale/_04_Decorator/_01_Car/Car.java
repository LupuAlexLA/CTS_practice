package _99_My_Examples._02_structurale._04_Decorator._01_Car;

public class Car implements IVehicle {
    private String producer;
    private int power;

    public Car(String producer, int power) {
        this.producer = producer;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("The car is moving");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped");
    }
}
