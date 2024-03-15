package _01_Singleton;

public class Main {
    public static void main(String[] args) {
        LoggerEager logger1 = LoggerEager.instance;
        logger1.log("Eager Init");

        LoggerLazyThreadSafe logger2 = LoggerLazyThreadSafe.getInstance();
        logger2.log("Lazy Init and Thread Safe");

        LoggerEnum logger3 = LoggerEnum.INSTANCE;
        logger3.log("Enum");
    }
}
