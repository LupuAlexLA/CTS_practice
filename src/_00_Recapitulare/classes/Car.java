package _00_Recapitulare.classes;

import _00_Recapitulare.interfaces.Tunable;

public class Car extends Vehicle implements Tunable {
    private String producer;
    private int productionYear;
    private Engine engine;
    private final int NB_OF_SEATS = 5;

    public Car() {
        super("red", 4500);
        producer = "";
        productionYear = 2008;
    }

    public Car(String producer, int productionYear) {
        this.producer = producer;
        this.productionYear = productionYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printDetails() {
        System.out.println(producer + " : " + productionYear);
    }

    @Override
    public float computeFinalPrice() {
        if(engine != null)
        {
            if(engine.getEngineType() == EngineType.BLG)
                return getPrice() - 15000;
            if(engine.getEngineType() == EngineType.AXX)
                return getPrice() - 10000;
            if(engine.getEngineType() == EngineType.BYD)
                return getPrice() - 5000;
            if(engine.getEngineType() == EngineType.BUB)
                return getPrice();
        }
        return getPrice();
    }

    @Override
    public final int upgradeStage() {
        return (int)getPrice();
    }
}
