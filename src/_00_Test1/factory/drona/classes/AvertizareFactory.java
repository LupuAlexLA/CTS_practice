package _00_Test1.factory.drona.classes;

import java.time.LocalDateTime;

public class AvertizareFactory implements AbstractFactory {
    @Override
    public FieldReport create(double lat, double lng, String details) {
        return new Avertizare(LocalDateTime.now(), lat, lng, details);
    }
}
