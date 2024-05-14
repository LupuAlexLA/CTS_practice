package _99_My_Examples._03_comportamentale._07_Template._01_Measurement;

public class Main {
    public static void main(String[] args) {
        Measurement measurement1 = new AverageMeasurement();
        measurement1.measure();

        Measurement measurement2 = new PeekMeasurement();
        measurement2.measure();
    }
}
