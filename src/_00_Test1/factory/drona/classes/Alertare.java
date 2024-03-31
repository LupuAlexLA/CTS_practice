package _00_Test1.factory.drona.classes;

import java.time.LocalDateTime;

public class Alertare implements FieldReport {
    private LocalDateTime timeStamp;
    private double lat;
    private double lng;
    private String details;

    Alertare(LocalDateTime timeStamp, double lat, double lng, String details) {
        this.timeStamp = timeStamp;
        this.lat = lat;
        this.lng = lng;
        this.details = details;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return this.timeStamp;
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
