package _Test._01_command;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Operator operator = new Operator();

        operator.takeOrder(new SportOrder(factory));
        operator.takeOrder(new OffroadOrder(factory));

        operator.sendOrders();
    }
}
