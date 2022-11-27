package Practice3.Builder.food.drinks;

import Practice3.Builder.Item;
import Practice3.Builder.packing.Bottle;
import Practice3.Builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
