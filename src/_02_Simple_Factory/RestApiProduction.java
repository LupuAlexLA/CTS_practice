package _02_Simple_Factory;

public class RestApiProduction implements RestApi {
    @Override
    public void connect() {
        System.out.println("Connecting to the prod server!");
    }
}
