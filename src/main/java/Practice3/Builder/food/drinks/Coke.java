package Practice3.Builder.food.drinks;

public class Coke extends ColdDrink{
    public Coke() {
    }

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 15.f;
    }
}
