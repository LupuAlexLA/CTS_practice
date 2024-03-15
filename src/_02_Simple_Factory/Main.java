package _02_Simple_Factory;

public class Main {
    public static void main(String[] args) {
        RestApiFactory factory = new RestApiFactory();
        RestApi api = factory.getRestApi("dev");
        api.connect();

        api = factory.getRestApi("prod");
        api.connect();
    }
}
