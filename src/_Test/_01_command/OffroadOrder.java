package _Test._01_command;

public class OffroadOrder implements AbstractProductionLine {
    private Factory factory;

    public OffroadOrder(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void produceTire(String characteristics) {
        factory.createOffroadTire();
    }

    @Override
    public void stopProductionLine(String reason) {
        factory.stopProduction();
    }
}
