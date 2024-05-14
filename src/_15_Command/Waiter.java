package _15_Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();

    public void takeOrder(FoodOrder order) {
        orders.add(order);
    }

    public void sendOrders() {
        for (FoodOrder o : orders) {
            o.prepare();
        }
        orders.clear();
    }
}
