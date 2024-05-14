package _99_My_Examples._03_comportamentale._05_Command;

public class BackendOrder implements CodeOrder {
    private Developer developer;

    public BackendOrder(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void code() {
        developer.codeBackend();
    }
}
