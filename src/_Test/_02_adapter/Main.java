package _Test._02_adapter;

public class Main {
    public static void main(String[] args) {
        AbstractProductionLine normal1 = new NormalTire();
        normal1.produceTire("semi-slick");
        normal1.stopProductionLine("changing tire template");

        System.out.println();

        AbstractProductionLine normal2 = new NormalTire();
        normal2.produceTire("drift");
        normal2.stopProductionLine("changing tire template");

        System.out.println();

        AbstractReducedSizeLine small1 = new SmallTire();
        small1.produceSmallSizeTire();
        small1.stopLine(13);

        System.out.println();

        AbstractReducedSizeLine small2 = new SmallTire();
        small2.produceSmallSizeTire();
        small2.stopLine(27);

        System.out.println();

        small1 = new NormalToSmallObjectAdapter(normal1);
        small1.produceSmallSizeTire();
        small1.stopLine(47);

        System.out.println();

        small2 = new NormalToSmallObjectAdapter(normal2);
        small2.produceSmallSizeTire();
        small2.stopLine(69);
    }
}
