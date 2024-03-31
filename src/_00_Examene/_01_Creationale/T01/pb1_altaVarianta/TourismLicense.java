package _00_Examene._01_Creationale.T01.pb1_altaVarianta;

public class TourismLicense implements AbstractTourismLicense {
    private static volatile TourismLicense instance = null;
    private String licenseNumber;
    private boolean isLicenseNumberSet = false;

    private TourismLicense() {}

    public static TourismLicense getInstance() {
        if (instance == null) {
            synchronized (TourismLicense.class) {
                if (instance == null) {
                    instance = new TourismLicense();
                }
            }
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String number){
        if (isLicenseNumberSet) {
            try {
                throw new LicenseNumberModificationException();
            } catch (LicenseNumberModificationException e) {
                throw new RuntimeException(e);
            }
        }
        licenseNumber = number;
        isLicenseNumberSet = true;
    }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
