package Practice3.Builder;

public class BuilderPatternDemo {

    public static void main(String[] args){

        Meal meal = MealBuilder.prepareNonVegMeal();
        Meal vegMeal = MealBuilder.prepareVegMeal();

        System.out.println("Non vegetarian meal: ");
        meal.showItems();
        System.out.println("Total cost: " + meal.getCost());

        System.out.println("Vegetarian meal: ");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
    }
}
