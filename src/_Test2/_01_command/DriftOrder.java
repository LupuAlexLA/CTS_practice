package _Test2._01_command;

public class DriftOrder implements AbstractProductionLine {
    private ProductionLine productionLine;

    public DriftOrder(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    @Override
    public void produceTire(String characteristics) {
        productionLine.produceDrift();
    }

    @Override
    public void stopProductionLine(String reason) {
        productionLine.stopProductionLine();
    }
}
