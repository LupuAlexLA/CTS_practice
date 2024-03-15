package _01_Singleton;

public class LoggerEager {
    public static final LoggerEager instance = new LoggerEager();

    private LoggerEager() {}

    public void log(String message) {
        System.out.println("This is a " + message + " singleton");
    }
}
