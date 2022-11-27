package Practice3.Builder.food.burgers;

public class VegBurger extends Burger{
    public VegBurger() {
    }

    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public float price() {
        return 30.f;
    }
}
