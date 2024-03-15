package _01_Singleton;

public class LoggerLazyThreadSafe {
    public static LoggerLazyThreadSafe instance = null;
    private LoggerLazyThreadSafe() {}

    public static synchronized LoggerLazyThreadSafe getInstance() {
        if(instance == null) {
            instance = new LoggerLazyThreadSafe();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("This is a " + message + " singleton");
    }
}
