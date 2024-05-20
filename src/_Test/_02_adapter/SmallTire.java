package _Test._02_adapter;

public class SmallTire implements AbstractReducedSizeLine {
    @Override
    public void produceSmallSizeTire() {
        System.out.println("Small tire created");
    }

    @Override
    public void stopLine(int reasonCode) {
        System.out.println("Production line stopped because " + reasonCode);
    }
}
