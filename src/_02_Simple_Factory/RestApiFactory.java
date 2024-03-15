package _02_Simple_Factory;

public class RestApiFactory {

    public static final String DEV = "dev";
    public static final String PROD = "prod";

    public RestApi getRestApi(String serverType) {
        if(DEV.equals(serverType)) {
            return new RestApiDevelopment();
        } else if (PROD.equals(serverType)) {
            return new RestApiProduction();
        } else {
            return null;
        }
    }
}
