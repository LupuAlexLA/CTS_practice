package _00_Examene._01_Creationale.T01.pb1_colega;

public class Main {
    public static void main(String[] args) {

        TourismLicenseThread thread = new TourismLicenseThread();
        thread.run();
        TourismLicense tourismLicense1 = thread.getLicense1();
        TourismLicense tourismLicense2 = TourismLicense.getInstance();
        TourismLicense tourismLicense3 = TourismLicense.getInstance();
        System.out.println(tourismLicense1 == tourismLicense2);
        System.out.println(tourismLicense2 == tourismLicense3);
        tourismLicense1.setLicenseNumber();

        System.out.println(tourismLicense1);
        System.out.println(tourismLicense2);
        System.out.println(tourismLicense3);

    }
}
