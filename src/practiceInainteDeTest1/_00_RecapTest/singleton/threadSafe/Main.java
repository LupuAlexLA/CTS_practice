package practiceInainteDeTest1._00_RecapTest.singleton.threadSafe;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            TourismLicense license = TourismLicense.getInstance();
            license.setLicenseNumber("123-456");
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
