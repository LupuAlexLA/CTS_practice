package _99_My_Examples._02_structurale._05_Facade._01_Car;

public class Suspension {
    private String type;

    public Suspension() {
        this.type = "normal";
    }

    public void turnOnSport() {
        this.type = "lower";
        System.out.println("suspension : lower");
    }

    public void turnOnOffRoad() {
        this.type = "higher";
        System.out.println("suspension: higher");
    }
}
