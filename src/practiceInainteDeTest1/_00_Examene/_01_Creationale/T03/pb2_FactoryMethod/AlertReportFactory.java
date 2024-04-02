package practiceInainteDeTest1._00_Examene._01_Creationale.T03.pb2_FactoryMethod;

public class AlertReportFactory implements AbstractReportFactory {
    @Override
    public FieldReport createReport(double lat, double lng, String details) {
        return new AlertReport(lat, lng, details);
    }
}
