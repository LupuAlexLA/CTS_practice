package lastShot.singletonRegistry;

import _00_Test1.singleton.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put(SingletonRegistry.Control.class.getSimpleName(), new Control());
        registry.put(SingletonRegistry.Web.class.getSimpleName(), new Web());
        registry.put(SingletonRegistry.Gps.class.getSimpleName(), new Gps());
    }

    public <T> T getSingleton(String className) {
        return (T) registry.get(className);
    }

    public static class Control implements ServiceConnection {
        private Control() {}

        @Override
        public void connect() {
            System.out.println("control connecting...");
        }

        @Override
        public void disconnect() {
            System.out.println("control disconnecting...");
        }
    }

    public static class Web implements ServiceConnection {
        private Web() {}

        @Override
        public void connect() {
            System.out.println("web connecting...");
        }

        @Override
        public void disconnect() {
            System.out.println("web disconnecting...");
        }
    }

    public static class Gps implements ServiceConnection {
        private Gps() {}

        @Override
        public void connect() {
            System.out.println("gps connecting...");
        }

        @Override
        public void disconnect() {
            System.out.println("gps disconnecting...");
        }
    }
}
