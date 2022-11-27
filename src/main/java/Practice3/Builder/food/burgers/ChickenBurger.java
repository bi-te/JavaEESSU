package Practice3.Builder.food.burgers;

public class ChickenBurger extends Burger{
    public ChickenBurger() {
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 25.f;
    }
}
