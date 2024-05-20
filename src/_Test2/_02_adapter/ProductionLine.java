package _Test2._02_adapter;

public class ProductionLine implements AbstractProductionLine {
    @Override
    public void produceTire(String characteristics) {
        System.out.println("Normal tire with: " + characteristics + " characteristics!");
    }

    @Override
    public void stopProductionLine(String reason) {
        System.out.println("The normal production stopped because " + reason + " !");
    }
}
