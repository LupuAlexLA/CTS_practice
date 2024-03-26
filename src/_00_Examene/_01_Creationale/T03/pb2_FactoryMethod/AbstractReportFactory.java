package _00_Examene._01_Creationale.T03.pb2_FactoryMethod;

public interface AbstractReportFactory {
    FieldReport createReport(double lat, double lng, String details);
}
