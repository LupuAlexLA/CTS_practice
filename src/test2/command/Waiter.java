package test2.command;
// cel care preia comenzile si mai departe le trimite catre cel care tre sa le execute
import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> foodOrders = new ArrayList<>();

    public void addOrder(FoodOrder foodOrder) {
        foodOrders.add(foodOrder);
    }

    public void sendOrders() {
        for(FoodOrder f : foodOrders) {
            f.cook(); // le trimite la bucatarie
        }
        foodOrders.clear(); // le sterge de pe lista
    }
}
