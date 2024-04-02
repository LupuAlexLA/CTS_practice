package practiceInainteDeTest1._00_Test1.singleton.registry;

public class Main {
    public static void main(String[] args) {
        Registry reg = new Registry();

        Registry.Control control = Registry.getSingleton(
                Registry.Control.class.getSimpleName());

        Registry.Control otherControl = Registry.getSingleton(
                Registry.Control.class.getSimpleName());

        if (control == otherControl) {
            System.out.println("same ref");
        } else {
            System.out.println("diff ref");
        }

        Registry.Web web = Registry.getSingleton(
                Registry.Web.class.getSimpleName());
        web.connect();
        web.disconnect();

        Registry.Gps gps = Registry.getSingleton(
                Registry.Gps.class.getSimpleName());
        gps.connect();
        gps.disconnect();

    }
}
