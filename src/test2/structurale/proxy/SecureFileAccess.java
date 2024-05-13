package test2.structurale.proxy;

public class SecureFileAccess implements AbstractSecureFileAccess {

    public static final String ROOT = "root";
    public static final String PASS = "pass";

    @Override
    public boolean isSecured(String file, String key) {
        return ROOT.equals(file) && PASS.equals(key);
    }
}
