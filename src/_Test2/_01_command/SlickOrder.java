package _Test2._01_command;

public class SlickOrder implements AbstractProductionLine {
    private ProductionLine productionLine;

    public SlickOrder(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    @Override
    public void produceTire(String characteristics) {
        productionLine.produceSlick();
    }

    @Override
    public void stopProductionLine(String reason) {
        productionLine.stopProductionLine();
    }
}
