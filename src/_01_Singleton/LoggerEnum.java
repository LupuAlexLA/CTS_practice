package _01_Singleton;

public enum LoggerEnum {
    INSTANCE;

    public void log(String message) {
        System.out.println("This is a " + message + " singleton");
    }
}
