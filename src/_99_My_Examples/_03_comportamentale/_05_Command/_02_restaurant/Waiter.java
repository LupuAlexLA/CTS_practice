package _99_My_Examples._03_comportamentale._05_Command._02_restaurant;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();

    public void addOrderToList(FoodOrder order) {
        orders.add(order);
    }

    public void sendOrders() {
        for(FoodOrder o : orders) {
            o.prepare();
        }
        orders.clear();
    }
}
