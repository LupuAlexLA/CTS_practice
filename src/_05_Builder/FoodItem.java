package _05_Builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private float price;
    private String producer;
    private LocalDate bestBefore;
    private float discount;
    private boolean isGlutenFree;
    private boolean isVegan;

    private FoodItem() {
    }

    FoodItem(String name, float price, String producer,
             LocalDate bestBefore, float discount,
             boolean isGlutenFree, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.bestBefore = bestBefore;
        this.discount = discount;
        this.isGlutenFree = isGlutenFree;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public float getDiscount() {
        return discount;
    }

    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", bestBefore=" + bestBefore +
                ", discount=" + discount +
                ", isGlutenFree=" + isGlutenFree +
                ", isVegan=" + isVegan +
                '}';
    }

    public static class Builder {
        private FoodItem foodItem = new FoodItem();

        public void addName(String name) {
            foodItem.name = name;
        }

        public void addProducer(String producer) {
            foodItem.producer = producer;
        }

        public void addPrice(float price) {
            foodItem.price = price;
        }

        public void addDiscount(float discount) {
            foodItem.discount = discount;
        }

        public void addBestBefore(LocalDate bestBefore) {
            foodItem.bestBefore = bestBefore;
        }

        public void addIsVegan(boolean isVegan) {
            foodItem.isVegan = isVegan;
        }

        public void addIsGlutenFree(boolean isGlutenFree) {
            foodItem.isGlutenFree = isGlutenFree;
        }

        public FoodItem build() {
            //return foodItem;
            FoodItem copy = foodItem;
            foodItem = new FoodItem();
            return copy;
        }
    }
}
