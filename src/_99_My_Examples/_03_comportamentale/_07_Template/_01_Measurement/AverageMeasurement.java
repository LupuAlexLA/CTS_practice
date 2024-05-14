package _99_My_Examples._03_comportamentale._07_Template._01_Measurement;

public class AverageMeasurement extends Measurement {
    @Override
    protected void takeMeasurement() {
        System.out.println("The engineer measured 3 V/m!");
    }

    @Override
    protected void introduceMeasurement() {
        System.out.println("The engineer introduced the measurement in system!");
    }

    @Override
    protected void notifyAllMembers() {
        System.out.println("The engineer notify all members!");
    }
}
