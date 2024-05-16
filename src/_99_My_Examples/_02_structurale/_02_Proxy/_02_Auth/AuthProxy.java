package _99_My_Examples._02_structurale._02_Proxy._02_Auth;

public class AuthProxy implements IAuth {
    private IAuth auth;

    public AuthProxy(IAuth auth) {
        this.auth = auth;
    }

    @Override
    public boolean login(String user, String pass) {
        return auth.login(user, pass);
    }
}
