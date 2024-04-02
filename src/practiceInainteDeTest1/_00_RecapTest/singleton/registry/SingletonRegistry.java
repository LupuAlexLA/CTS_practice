package practiceInainteDeTest1._00_RecapTest.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put(SingletonRegistry.Control.class.getSimpleName(), new SingletonRegistry.Control());
        registry.put(SingletonRegistry.Web.class.getSimpleName(), new SingletonRegistry.Web());
        registry.put(SingletonRegistry.Gps.class.getSimpleName(), new SingletonRegistry.Gps());
    }

    public static <T> T getSingleton(String className) {
        return (T) registry.get(className);
    }

    public static class Control implements ServiceConnection {
        private Control() {}

        @Override
        public void connect() {
            System.out.println("the control is conected");
        }

        @Override
        public void disconnect() {
            System.out.println("the control is disconected");
        }
    }

    public static class Web implements ServiceConnection {
        private Web() {}

        @Override
        public void connect() {
            System.out.println("the web is conected");
        }

        @Override
        public void disconnect() {
            System.out.println("the web is disconected");
        }
    }

    public static class Gps implements ServiceConnection {
        private Gps() {}

        @Override
        public void connect() {
            System.out.println("the gps is conected");
        }

        @Override
        public void disconnect() {
            System.out.println("the gps is disconected");
        }
    }
}
