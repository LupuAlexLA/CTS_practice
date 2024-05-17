package _99_My_Examples._02_structurale._02_Proxy._03_Spital;

public class Main {
    public static void main(String[] args) {
        ISpital vizitator = new Vizitator(true);
        VizitatorProxy vizitatorProxy = new VizitatorProxy(vizitator);

        vizitatorProxy.accesSalon((Vizitator) vizitator);

        ISpital vizitator2 = new Vizitator(true);
        VizitatorProxy vizitatorProxy2 = new VizitatorProxy(vizitator2);

        vizitatorProxy2.accesSalon((Vizitator) vizitator2);

        ISpital vizitator3 = new Vizitator(true);
        VizitatorProxy vizitatorProxy3 = new VizitatorProxy(vizitator3);

        vizitatorProxy3.accesSalon((Vizitator) vizitator3);

        ISpital vizitator4 = new Vizitator(true);
        VizitatorProxy vizitatorProxy4 = new VizitatorProxy(vizitator4);

        vizitatorProxy4.accesSalon((Vizitator) vizitator4);

        ISpital vizitator5 = new Vizitator(true);
        VizitatorProxy vizitatorProxy5 = new VizitatorProxy(vizitator5);

        vizitatorProxy5.accesSalon((Vizitator) vizitator5);
    }
}
