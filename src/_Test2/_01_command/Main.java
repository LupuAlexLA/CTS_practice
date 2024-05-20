package _Test2._01_command;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        ProductionLine productionLine = new ProductionLine();

        operator.takeOrder(new SlickOrder(productionLine));
        operator.takeOrder(new OffroadOrder(productionLine));
        operator.takeOrder(new DriftOrder(productionLine));

        operator.sendOrders();
    }
}
