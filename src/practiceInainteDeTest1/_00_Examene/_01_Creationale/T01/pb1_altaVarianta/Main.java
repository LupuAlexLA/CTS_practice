package practiceInainteDeTest1._00_Examene._01_Creationale.T01.pb1_altaVarianta;

public class Main {
    public static void main(String[] args) {
        TourismLicense license1 = TourismLicense.getInstance();
        license1.setLicenseNumber("LIC123");

        TourismLicense license2 = TourismLicense.getInstance();
        System.out.println(license2.getLicenseNumber()); // Afișează: LIC123

        new Thread(() -> {
            TourismLicense license3 = TourismLicense.getInstance();
            System.out.println(license3.getLicenseNumber()); // Afișează: LIC123
            license3.setLicenseNumber("LIC456");
        }).start();
    }
}
