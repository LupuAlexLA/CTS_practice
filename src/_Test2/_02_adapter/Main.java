package _Test2._02_adapter;

public class Main {
    public static void main(String[] args) {
        AbstractProductionLine normalTire1 = new ProductionLine();
        normalTire1.produceTire("245 45 R18");
        normalTire1.stopProductionLine("changing tire template");

        System.out.println();

        AbstractProductionLine normalTire2 = new ProductionLine();
        normalTire2.produceTire("225 35 R17");
        normalTire2.stopProductionLine("changing tire template");

        System.out.println();

        AbstractReducedSizeLine smallTire1 = new ReducedSizeLine();
        smallTire1.produceSmallSizeTire();
        smallTire1.stopLine(27);

        System.out.println();

        AbstractReducedSizeLine smallTire2 = new ReducedSizeLine();
        smallTire2.produceSmallSizeTire();
        smallTire2.stopLine(47);

        System.out.println();

        smallTire1 = new NormalToSmallObjectAdapter(normalTire1);
        smallTire1.produceSmallSizeTire();
        smallTire1.stopLine(98);

        System.out.println();

        smallTire2 = new NormalToSmallObjectAdapter(normalTire2);
        smallTire2.produceSmallSizeTire();
        smallTire2.stopLine(99);
    }
}
