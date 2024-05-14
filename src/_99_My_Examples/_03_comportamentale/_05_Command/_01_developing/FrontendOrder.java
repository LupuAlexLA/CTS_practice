package _99_My_Examples._03_comportamentale._05_Command._01_developing;

public class FrontendOrder implements CodeOrder {
    private Developer developer;

    public FrontendOrder(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void code() {
        developer.codeFrontend();
    }
}
