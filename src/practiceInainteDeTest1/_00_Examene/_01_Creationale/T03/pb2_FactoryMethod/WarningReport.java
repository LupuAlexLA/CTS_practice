package practiceInainteDeTest1._00_Examene._01_Creationale.T03.pb2_FactoryMethod;

import java.time.LocalDateTime;

public class WarningReport implements FieldReport {
    private double lat;
    private double lng;
    private String details;

    public WarningReport(double lat, double lng, String details) {
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
        return lat;
    }

    @Override
    public double getLongitude() {
        return lng;
    }

    @Override
    public String getDetails() {
        return details;
    }
}
