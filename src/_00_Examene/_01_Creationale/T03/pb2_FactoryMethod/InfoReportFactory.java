package _00_Examene._01_Creationale.T03.pb2_FactoryMethod;

public class InfoReportFactory implements AbstractReportFactory {
    @Override
    public FieldReport createReport(double lat, double lng, String details) {
        return new InfoReport(lat, lng, details);
    }
}
