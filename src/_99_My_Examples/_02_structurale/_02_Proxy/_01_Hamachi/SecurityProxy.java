package _99_My_Examples._02_structurale._02_Proxy._01_Hamachi;

public class SecurityProxy implements ISecurity {
    private ISecurity security;

    public SecurityProxy(ISecurity security) {
        this.security = security;
    }

    @Override
    public boolean isHamachiOpen(boolean answer) {
        if(answer == true) {
            System.out.println("Connection successfully");
            return answer;
        } else {
            System.out.println("Connection unsuccessfully");
            return answer;
        }
    }
}
