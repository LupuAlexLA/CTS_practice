package _Test2._02_adapter;

public class ReducedSizeLine implements AbstractReducedSizeLine {
    @Override
    public void produceSmallSizeTire() {
        System.out.println("Small tire produced!");
    }

    @Override
    public void stopLine(int reasonCode) {
        System.out.println("The small production line stopped for reason code " + reasonCode);
    }
}
