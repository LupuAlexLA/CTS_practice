package _08_Proxy;

public class Main {
    public static void main(String[] args) {
        AbstractAuthenticationService authenticationService = new AuthenticationService();
        AbstractAuthenticationService authenticationServiceProxy =
                new AuthenticationServiceProxy(authenticationService);

        boolean loggedIn = authenticationService.login("admin", "admin");
        System.out.println(loggedIn);

        for (int i = 0; i < 5; i++) {
            authenticationServiceProxy.login("wrong username", "wrong pass");
        }

        loggedIn = authenticationServiceProxy.login("admin", "admin");
        System.out.println(loggedIn);
    }
}
