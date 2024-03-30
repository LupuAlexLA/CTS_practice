package _00_ChatGPT_sameProblems._01_SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put(CentralSystem.class.getSimpleName(), new CentralSystem());
        registry.put(AirQuality.class.getSimpleName(), new AirQuality());
        registry.put(NavigateSystem.class.getSimpleName(), new NavigateSystem());
    }

    public <T> T getRegistry(String type) {
        return (T) registry.get(type);
    }

    public static class CentralSystem implements DeviceConnection {
        CentralSystem() {}

        @Override
        public void establishConnection() {
            System.out.println("The connection is on!");
        }

        @Override
        public void terminateConnection() {
            System.out.println("The connection is off!");
        }
    }

    public static class AirQuality implements DeviceConnection {
        AirQuality() {}

        @Override
        public void establishConnection() {
            System.out.println("The connection is on!");
        }

        @Override
        public void terminateConnection() {
            System.out.println("The connection is off!");
        }
    }

    public static class NavigateSystem implements DeviceConnection {
        NavigateSystem() {}

        @Override
        public void establishConnection() {
            System.out.println("The connection is on!");
        }

        @Override
        public void terminateConnection() {
            System.out.println("The connection is off!");
        }
    }
}
