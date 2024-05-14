package _14_State;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.addMoney(10);
        machine.buyProduct(5);
        //machine.buyProduct(11);
    }
}
