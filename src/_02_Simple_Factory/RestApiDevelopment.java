package _02_Simple_Factory;

public class RestApiDevelopment implements RestApi {
    @Override
    public void connect() {
        System.out.println("Connecting to the dev server!");
    }
}
