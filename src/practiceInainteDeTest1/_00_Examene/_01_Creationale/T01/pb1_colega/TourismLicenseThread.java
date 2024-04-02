package practiceInainteDeTest1._00_Examene._01_Creationale.T01.pb1_colega;

public class TourismLicenseThread extends Thread {
    private TourismLicense license1;
    @Override
    public void run() {
        license1 = TourismLicense.getInstance();
    }

    public TourismLicense getLicense1() {
        return license1;
    }
}