package _00_Test1.singleton.threadSafe;

public class LicenseExistException extends RuntimeException {
    LicenseExistException(String message) { super(message); }
}
