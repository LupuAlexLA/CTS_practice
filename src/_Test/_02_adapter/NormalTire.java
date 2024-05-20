package _Test._02_adapter;

public class NormalTire implements AbstractProductionLine {
    @Override
    public void produceTire(String characteristics) {
        System.out.println("Tire created with " + characteristics);
    }

    @Override
    public void stopProductionLine(String reason) {
        System.out.println("Production line stopped because " + reason);
    }
}
