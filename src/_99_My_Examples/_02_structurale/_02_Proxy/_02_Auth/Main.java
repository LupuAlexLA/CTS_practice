package _99_My_Examples._02_structurale._02_Proxy._02_Auth;

public class Main {
    public static void main(String[] args) {
        IAuth auth = new Auth();
        AuthProxy proxy = new AuthProxy(auth);

        boolean isAuth1 = proxy.login("admin", "admin");
        boolean isAuth2 = proxy.login("alt user", "alta parola");

        System.out.println(isAuth1);
        System.out.println(isAuth2);
    }
}
