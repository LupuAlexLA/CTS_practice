package _00_Examene._01_Creationale.T01.pb1_singletonThreadSafe;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            License license = License.getInstance();
            try {
              license.setLicenseNumber("123-456");
              //System.out.println(license);
            } catch (LicenseException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(license);
        };

        Thread mainT1 = new Thread(task);
        Thread mainT2 = new Thread(task);
        Thread secondary = new Thread(task);

        mainT1.start();
        mainT2.start();
        secondary.run();
    }
}
