package _05_Builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodItem.Builder builder = new FoodItem.Builder();
        builder.addName("pizza");
        builder.addPrice(24.5f);
        builder.addBestBefore(LocalDate.now().plusDays(3));

        FoodItem pizza = builder.build();
        System.out.println(pizza);

        FoodItem item = builder.build();
        System.out.println(item);
        System.out.println(pizza);

        FoodItemBuilder foodItemBuilder = new FoodItemBuilder();
        foodItemBuilder.addName("pasta").addPrice(25.5f)
                .addIsGlutenFree(true).addIsVegan(true);
        FoodItem pasta = foodItemBuilder.build();
        System.out.println(pasta);

        FoodItemDirector director = new FoodItemDirector();
        FoodItem sandwich = director.create("club sandwich", 10.5f);
        System.out.println(sandwich);

    }
}

//first run
/*
FoodItem{name='pizza', price=24.5, producer='null', bestBefore=2024-03-29, discount=0.0, isGlutenFree=false, isVegan=false}
FoodItem{name='pizza', price=24.5, producer='null', bestBefore=2024-03-29, discount=0.0, isGlutenFree=false, isVegan=false}
FoodItem{name='pizza', price=24.5, producer='null', bestBefore=2024-03-29, discount=0.0, isGlutenFree=false, isVegan=false}
FoodItem{name='pasta', price=25.5, producer='null', bestBefore=null, discount=0.0, isGlutenFree=true, isVegan=true}
FoodItem{name='club sandwich', price=10.5, producer='null', bestBefore=null, discount=0.0, isGlutenFree=false, isVegan=false}
*/