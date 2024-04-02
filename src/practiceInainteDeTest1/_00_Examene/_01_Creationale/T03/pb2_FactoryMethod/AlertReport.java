package practiceInainteDeTest1._00_Examene._01_Creationale.T03.pb2_FactoryMethod;

import java.time.LocalDateTime;

public class AlertReport implements FieldReport {
    private double lat;
    private double lng;
    private String details;

    public AlertReport(double lat, double lng, String details) {
        this.lat = lat;
        this.lng = lng;
        this.details = details;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return LocalDateTime.now();
    }

    @Override
    public double getLatitude() {
        return this.lat;
    }

    @Override
    public double getLongitude() {
        return this.lng;
    }

    @Override
    public String getDetails() {
        return this.details;
    }
}
