package practiceInainteDeTest1._00_Test1.singleton.threadSafe;

public class TourismLicense implements AbstractTourismLicense {
    private String LicenseNo;
    private boolean isLicenseNoSet = false;
    private static TourismLicense instance = null;

    private TourismLicense() {}

    public static synchronized TourismLicense getInstance() {
        if(instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String number) {
        if(isLicenseNoSet) {
            throw new LicenseExistException("a mai fost setat odata!");
        } else {
            LicenseNo = number;
            isLicenseNoSet = true;
            System.out.println("license was set " + number);
        }
    }

    @Override
    public String getLicenseNumber() {
        return LicenseNo;
    }

    @Override
    public String toString() {
        return "TourismLicense{" +
                "LicenseNo='" + LicenseNo + '\'' +
                ", isLicenseNoSet=" + isLicenseNoSet +
                '}';
    }
}
