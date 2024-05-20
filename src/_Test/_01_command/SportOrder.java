package _Test._01_command;

public class SportOrder implements AbstractProductionLine {
    private Factory factory;

    public SportOrder(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void produceTire(String characteristics) {
        factory.createSportTire();
    }

    @Override
    public void stopProductionLine(String reason) {
        factory.stopProduction();
    }
}
