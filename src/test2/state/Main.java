package test2.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(5d);
        vendingMachine.selectProduct(3d);
    }
}
