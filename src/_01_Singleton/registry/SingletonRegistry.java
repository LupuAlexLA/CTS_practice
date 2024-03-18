package _01_Singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put("log", new Logger());
        registry.put("database", new DatabaseConnection());
    }

    public <T> T getRegistry(String key) {
        return (T) registry.get(key);
    }

    public static class DatabaseConnection {
        private DatabaseConnection() {};

        public void connect() {
            System.out.println("Connecting to database!");
        }
    }
}
