package _01_Singleton.registry;

public class MainSingletonRegistry {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();
        Logger logger = registry.getRegistry("log");
        logger.log("first log today");

        SingletonRegistry.DatabaseConnection database = registry.getRegistry("database");
        database.connect();
    }
}
