package _Test._02_adapter;

import static java.lang.String.valueOf;

public class NormalToSmallObjectAdapter implements AbstractReducedSizeLine {
    private AbstractProductionLine abstractProductionLine;

    public NormalToSmallObjectAdapter(AbstractProductionLine abstractProductionLine) {
        this.abstractProductionLine = abstractProductionLine;
    }

    @Override
    public void produceSmallSizeTire() {
        abstractProductionLine.produceTire("adapted tire");
    }

    @Override
    public void stopLine(int reasonCode) {
        abstractProductionLine.stopProductionLine((String)valueOf(reasonCode));
    }
}
