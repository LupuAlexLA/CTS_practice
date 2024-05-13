package test2.structurale.proxy;

public class Main {
    public static void main(String[] args) {
        AbstractSecureFileAccess fileAccess = new SecureFileAccess();
        AbstractSecureFileAccess fileAccessProxy = new SecureFileAccessProxy(fileAccess);

        boolean testSecurity1 = fileAccess.isSecured("root", "pass");
        boolean testSecurity2 = fileAccess.isSecured("admin", "admin");

        System.out.println(testSecurity1);
        System.out.println(testSecurity2);
    }
}
