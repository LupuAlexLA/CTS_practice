package _99_My_Examples._03_comportamentale._03_State._02_VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("price = 5");
        machine.addMoney(10);
        machine.buyProduct(5);

        System.out.println("price = 10");
        machine.addMoney(10);
        machine.buyProduct(10);

        System.out.println("price = 15");
        machine.addMoney(10);
        machine.buyProduct(15);
    }
}
