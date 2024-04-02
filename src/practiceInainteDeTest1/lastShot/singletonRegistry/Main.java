package practiceInainteDeTest1.lastShot.singletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();

        SingletonRegistry.Control control = registry.getSingleton(SingletonRegistry.Control.class.getSimpleName());
        SingletonRegistry.Control otherControl = registry.getSingleton(SingletonRegistry.Control.class.getSimpleName());

        if(control == otherControl) {
            System.out.println("same refs");
        } else {
            System.out.println("diff refs");
        }

        SingletonRegistry.Web web = registry.getSingleton(SingletonRegistry.Web.class.getSimpleName());
        SingletonRegistry.Gps gps = registry.getSingleton(SingletonRegistry.Gps.class.getSimpleName());

        control.connect();
        control.disconnect();

        web.connect();
        web.disconnect();

        web.connect();
        web.disconnect();
    }
}
