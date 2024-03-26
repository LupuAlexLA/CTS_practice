package _00_Examene._01_Creationale.T03.pb1_singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put(ControlSpace.class.getSimpleName(), new ControlSpace());
        registry.put(WebService.class.getSimpleName(), new WebService());
        registry.put(GpsSatelitte.class.getSimpleName(), new GpsSatelitte());
    }

    public <T> T getSingleton(String className) {
        return (T) registry.get(className);
    }

    public static class ControlSpace implements ServiceConnection {
        private ControlSpace() {}

        @Override
        public void connect() {
            System.out.println("The drone is connected to the control space!");
        }

        @Override
        public void disconnect() {
            System.out.println("The drone is disconnected from the control space!");
        }
    }

    public static class WebService implements ServiceConnection {
        private WebService() {}

        @Override
        public void connect() {
            System.out.println("The drone is connected to the web service!");
        }

        @Override
        public void disconnect() {
            System.out.println("The drone is disconnected from the web service!");
        }
    }

    public static class GpsSatelitte implements ServiceConnection {
        private GpsSatelitte() {}

        @Override
        public void connect() {
            System.out.println("The drone is connected to the satelitte!");
        }

        @Override
        public void disconnect() {
            System.out.println("The drone is disconnected from the satelitte!");
        }
    }
}
