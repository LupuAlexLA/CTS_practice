package practiceInainteDeTest1._00_Examene._01_Creationale.T03.pb1_singletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.ControlSpace controlSpace = registry.getSingleton(
                SingletonRegistry.ControlSpace.class.getSimpleName());
        controlSpace.connect();
        controlSpace.disconnect();

        SingletonRegistry.WebService webService = registry.getSingleton(
                SingletonRegistry.WebService.class.getSimpleName());
        webService.connect();
        webService.disconnect();

        SingletonRegistry.GpsSatelitte gpsSatelitte = registry.getSingleton(
                SingletonRegistry.GpsSatelitte.class.getSimpleName());
        gpsSatelitte.connect();
        gpsSatelitte.disconnect();

        SingletonRegistry.ControlSpace controlSpace2 = registry.getSingleton(
                SingletonRegistry.ControlSpace.class.getSimpleName());

        if(controlSpace == controlSpace2) {
            System.out.println("Same refs!");
        } else {
            System.out.println("Diff ref!");
        }
    }
}
