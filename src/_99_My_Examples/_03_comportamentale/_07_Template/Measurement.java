package _99_My_Examples._03_comportamentale._07_Template;

public abstract class Measurement {
    public final void measure() {
        takeMeasurement();
        introduceMeasurement();
        notifyAllMembers();
    }

    protected abstract void takeMeasurement();
    protected abstract void introduceMeasurement();
    protected abstract void notifyAllMembers();
}
