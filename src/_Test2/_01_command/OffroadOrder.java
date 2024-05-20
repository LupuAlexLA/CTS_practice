package _Test2._01_command;

public class OffroadOrder implements AbstractProductionLine {
    private ProductionLine productionLine;

    public OffroadOrder(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    @Override
    public void produceTire(String characteristics) {
        productionLine.produceOffroad();
    }

    @Override
    public void stopProductionLine(String reason) {
        productionLine.stopProductionLine();
    }
}
