package test2.proxy;

public class SecureFileAccessProxy implements AbstractSecureFileAccess {
    private AbstractSecureFileAccess fileAccess;

    public SecureFileAccessProxy(AbstractSecureFileAccess fileAccess) {
        this.fileAccess = fileAccess;
    }

    @Override
    public boolean isSecured(String file, String key) {
        boolean isSuccessfulSecured = fileAccess.isSecured(file, key);
        return isSuccessfulSecured;
    }
}
