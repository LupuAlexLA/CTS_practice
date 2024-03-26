package _00_Examene._01_Creationale.T03.pb2_FactoryMethod;

public class WarningReportFactory implements AbstractReportFactory {
    @Override
    public FieldReport createReport(double lat, double lng, String details) {
        return new WarningReport(lat, lng, details);
    }
}
