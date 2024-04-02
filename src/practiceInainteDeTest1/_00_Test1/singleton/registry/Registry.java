package practiceInainteDeTest1._00_Test1.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private static Map<String, Object> reg = new HashMap<>();

    static {
        reg.put(Registry.Control.class.getSimpleName(), new Control());
        reg.put(Registry.Web.class.getSimpleName(), new Web());
        reg.put(Registry.Gps.class.getSimpleName(), new Gps());
    }

    public static <T> T getSingleton(String className) {
        return (T) reg.get(className);
    }

    public static class Control implements ServiceConnection {
        private Control() {
        }

        @Override
        public void connect() {
            System.out.println("connect");
        }

        @Override
        public void disconnect() {
            System.out.println("disconnect");
        }
    }

    public static class Gps implements ServiceConnection {
        private Gps() {
        }

        @Override
        public void connect() {
            System.out.println("connect");
        }

        @Override
        public void disconnect() {
            System.out.println("disconnect");
        }
    }

    public static class Web implements ServiceConnection {
        private Web() {
        }

        @Override
        public void connect() {
            System.out.println("connect");
        }

        @Override
        public void disconnect() {
            System.out.println("disconnect");
        }
    }
}
