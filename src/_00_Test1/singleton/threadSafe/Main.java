package _00_Test1.singleton.threadSafe;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            TourismLicense license = TourismLicense.getInstance();
            try {
                license.setLicenseNumber("123-456");
            } catch (LicenseExistException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(license);

        };

        Thread mainT1 = new Thread(task);
        Thread mainT2 = new Thread(task);
        Thread second = new Thread(task);

        mainT1.start();
        mainT2.start();
        second.run();
    }
}
