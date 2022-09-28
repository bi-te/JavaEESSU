package Practice3.Builder;

import Practice3.Builder.food.burgers.ChickenBurger;
import Practice3.Builder.food.burgers.VegBurger;
import Practice3.Builder.food.drinks.Coke;
import Practice3.Builder.food.drinks.Pepsi;

public class MealBuilder {

    public static Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
