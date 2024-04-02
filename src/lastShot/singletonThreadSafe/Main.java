package lastShot.singletonThreadSafe;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
          License license = License.getInstance();
          license.setLicenseNumber("123-123");
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
