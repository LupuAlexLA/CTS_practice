package _99_My_Examples._02_structurale._02_Proxy._02_Auth;

public class Auth implements IAuth {

    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    @Override
    public boolean login(String user, String pass) {
        return USERNAME.equals(user) && PASSWORD.equals(pass);
    }
}
