package _00_Examene._01_Creationale.T03.pb1_recap;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.Control control = registry.getSingleton(
                SingletonRegistry.Control.class.getSimpleName());
        control.connect();
        control.disconnect();

        SingletonRegistry.Control otherControl = registry.getSingleton(
                SingletonRegistry.Control.class.getSimpleName());

        if(control == otherControl)
            System.out.println("same ref");
        else
            System.out.println("diff ref");

        SingletonRegistry.Gps gps = registry.getSingleton(
                SingletonRegistry.Gps.class.getSimpleName());
        gps.connect();
        gps.disconnect();

        SingletonRegistry.Web web = registry.getSingleton(
                SingletonRegistry.Web.class.getSimpleName());
        web.connect();
        web.disconnect();
    }
}
