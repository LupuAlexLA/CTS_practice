package practiceInainteDeTest1._00_RecapTest.singleton.registry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();

        SingletonRegistry.Control control = SingletonRegistry.getSingleton(
                SingletonRegistry.Control.class.getSimpleName());

        SingletonRegistry.Control otherControl = SingletonRegistry.getSingleton(
                SingletonRegistry.Control.class.getSimpleName());

        if(control == otherControl) {
            System.out.println("same refs");
        } else {
            System.out.println("diff refs");
        }

        control.connect();
        control.disconnect();

        SingletonRegistry.Web web = SingletonRegistry.getSingleton(
                SingletonRegistry.Web.class.getSimpleName());

        web.connect();
        web.disconnect();

        SingletonRegistry.Gps gps = SingletonRegistry.getSingleton(
                SingletonRegistry.Gps.class.getSimpleName());

        gps.connect();
        gps.disconnect();
    }
}
