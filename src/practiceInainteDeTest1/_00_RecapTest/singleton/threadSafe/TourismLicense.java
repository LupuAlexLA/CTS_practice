package practiceInainteDeTest1._00_RecapTest.singleton.threadSafe;

public class TourismLicense implements AbstractTourismLicense {
    private String number;
    private boolean isNumberSet = false;
    private static TourismLicense instance = null;

    private TourismLicense() {}

    public synchronized static TourismLicense getInstance() {
        if(instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String number) {
        if(isNumberSet == true) {
            System.out.println("numarul licentei este deja setat");
        } else {
            System.out.println("a fost setat numarul licentei: " + this.number);
            this.number = number;
            this.isNumberSet = true;
        }
    }

    @Override
    public String getLicenseNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "TourismLicense{" +
                "number='" + number + '\'' +
                '}';
    }
}
