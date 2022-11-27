package Practice3.Builder.food.drinks;

public class Pepsi extends ColdDrink{
    public Pepsi() {
    }

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 18.f;
    }
}
