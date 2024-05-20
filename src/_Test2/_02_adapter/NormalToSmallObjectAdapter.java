package _Test2._02_adapter;

import static java.lang.String.valueOf;

public class NormalToSmallObjectAdapter implements AbstractReducedSizeLine {
    private AbstractProductionLine productionLine;

    public NormalToSmallObjectAdapter(AbstractProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    @Override
    public void produceSmallSizeTire() {
        productionLine.produceTire("default");
    }

    @Override
    public void stopLine(int reasonCode) {
        productionLine.stopProductionLine((String)valueOf(reasonCode));
    }
}
