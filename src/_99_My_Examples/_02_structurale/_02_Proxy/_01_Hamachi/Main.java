package _99_My_Examples._02_structurale._02_Proxy._01_Hamachi;

public class Main {
    public static void main(String[] args) {
        ISecurity security = new Security();
        SecurityProxy proxy = new SecurityProxy(security);

        proxy.isHamachiOpen(true);
        proxy.isHamachiOpen(false);
    }
}
