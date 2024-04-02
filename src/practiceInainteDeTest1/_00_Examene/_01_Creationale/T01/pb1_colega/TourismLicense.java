package practiceInainteDeTest1._00_Examene._01_Creationale.T01.pb1_colega;

import java.util.Random;

public class TourismLicense implements AbstractTourismLicense {
    private static TourismLicense instance;
    private Integer licenseNumber;
    private Random random;

    private TourismLicense() {}

    public static synchronized TourismLicense getInstance() {
        if(instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }
    @Override
    public void setLicenseNumber() {
        if(licenseNumber != null) {
            throw new IllegalStateException("License number has already been set.");
        }
        random = new Random();
        this.licenseNumber = random.nextInt(10_000);
    }

    @Override
    public String toString() {
        return "TourismLicense{" +
                "licenseNumber=" + licenseNumber +
                '}';
    }
}
