package _99_My_Examples._03_comportamentale._06_Observer;

public class Measurement extends Observable {
    private String newMeasurement;

    public Measurement(String newMeasurement) {
        this.newMeasurement = newMeasurement;
    }

    public void publishNewMeasurement(String description) {
        sendNotification(newMeasurement + " " + description);
    }
}
