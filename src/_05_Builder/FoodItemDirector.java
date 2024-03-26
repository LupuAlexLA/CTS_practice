package _05_Builder;

public class FoodItemDirector {
    private FoodItemBuilder builder;

    public FoodItem create(String name, float price) {
        builder = new FoodItemBuilder();
        return builder.addName(name).addPrice(price).build();
    }

    public FoodItem create(String name, float price, String producer) {
        builder = new FoodItemBuilder();
        return builder.addName(name).addPrice(price)
                .addProducer(producer).build();
    }
}
