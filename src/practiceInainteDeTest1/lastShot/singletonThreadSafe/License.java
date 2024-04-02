package practiceInainteDeTest1.lastShot.singletonThreadSafe;

public class License implements AbstractTourismLicense {
    private String number;
    private boolean isNumberSet = false;
    private static License instance = null;

    private License() {}

    public synchronized static License getInstance() {
        if(instance == null) {
            instance = new License();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String number) {
        if(isNumberSet == true) {
            System.out.println("a fost deja setat");
        } else {
            this.number = number;
            this.isNumberSet = true;
            System.out.println("numarul a fost setat cu " + number);
        }
    }

    @Override
    public String getLicenseNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "License{" +
                "number='" + number + '\'' +
                ", isNumberSet=" + isNumberSet +
                '}';
    }
}
