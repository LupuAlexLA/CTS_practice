package test2_something_else.observer;

public class HartaRadiatiei extends Observable {
    private String zona;
    private String masuratoare;

    public HartaRadiatiei(String zona) {
        this.zona = zona;
    }

    public String getMasuratoare() {
        return masuratoare;
    }

    public void setMasuratoare(String masuratoare) {
        this.masuratoare = masuratoare;
    }

    public void publishNewMeasurement() {
        super.sendNotifications("Zona " + zona + "masuratoare: " + masuratoare);
    }
}
