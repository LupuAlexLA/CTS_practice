package _Test2._01_command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<AbstractProductionLine> orders = new ArrayList<>();

    public void takeOrder(AbstractProductionLine order) {
        orders.add(order);
    }

    public void sendOrders() {
        for(AbstractProductionLine order : orders) {
            order.produceTire("default");
            order.stopProductionLine("default");
        }
        orders.clear();
    }
}
