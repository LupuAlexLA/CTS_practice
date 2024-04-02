package practiceInainteDeTest1._00_Test1.factory.drona.classes;

import java.time.LocalDateTime;

public class InformareFactory implements AbstractFactory {
    @Override
    public FieldReport create(double lat, double lng, String details) {
        return new Informare(LocalDateTime.now(), lat, lng, details);
    }
}
