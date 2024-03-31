package _00_Examene._01_Creationale.T03.pb1_recap;

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
            System.out.println("conn");
        }

        @Override
        public void disconnect() {
            System.out.println("disconn");
        }
    }

    public static class Web implements ServiceConnection {
        private Web() {}

        @Override
        public void connect() {
            System.out.println("con");
        }

        @Override
        public void disconnect() {
            System.out.println("disconn");
        }
    }

    public static class Gps implements ServiceConnection {
        private Gps() {}

        @Override
        public void connect() {
            System.out.println("conn");
        }

        @Override
        public void disconnect() {
            System.out.println("disconn");
        }
    }
}
