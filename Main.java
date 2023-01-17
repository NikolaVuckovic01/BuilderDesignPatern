package Klase;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        MealBuilder mb=new MealBuilder();
        System.out.println(mb.prepareNonVegMeal().getCost());
        mb.prepareNonVegMeal().showItems();
        System.out.println("\nManual meal\n");
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        meal.showItems();
        System.out.println("Price: "+meal.getCost());

    }
}
