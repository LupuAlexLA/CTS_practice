package _00_Test1.factory.drona.classes;

import java.time.LocalDateTime;

public interface FieldReport {
    LocalDateTime getTimestamp();
    double getLatitude();
    double getLongitude();
    String getDetails();
}
