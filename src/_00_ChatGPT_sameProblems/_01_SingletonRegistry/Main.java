package _00_ChatGPT_sameProblems._01_SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry registry = new SingletonRegistry();

        SingletonRegistry.CentralSystem centralSystem =
                registry.getRegistry(SingletonRegistry.CentralSystem.class.getSimpleName());
        centralSystem.establishConnection();
        centralSystem.terminateConnection();

        SingletonRegistry.CentralSystem centralSystem2 =
                registry.getRegistry(SingletonRegistry.CentralSystem.class.getSimpleName());

        if(centralSystem == centralSystem2)
            System.out.println("same object, Singleton did his job!");

        SingletonRegistry.AirQuality airQuality =
                registry.getRegistry(SingletonRegistry.AirQuality.class.getSimpleName());
        airQuality.establishConnection();
        airQuality.terminateConnection();

        SingletonRegistry.NavigateSystem navigateSystem =
                registry.getRegistry(SingletonRegistry.NavigateSystem.class.getSimpleName());
        navigateSystem.establishConnection();
        navigateSystem.terminateConnection();
    }
}
