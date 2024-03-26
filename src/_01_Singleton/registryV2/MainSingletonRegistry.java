package _01_Singleton.registryV2;

public class MainSingletonRegistry {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.Logger logger = registry.getSingleton(
                SingletonRegistry.Logger.class.getSimpleName());
        logger.log("First log");

        SingletonRegistry.DatabaseConnection db = registry.getSingleton(
                SingletonRegistry.DatabaseConnection.class.getSimpleName());
        db.connect();
    }
}
