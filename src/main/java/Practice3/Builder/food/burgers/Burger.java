package Practice3.Builder.food.burgers;

import Practice3.Builder.Item;
import Practice3.Builder.packing.Packing;
import Practice3.Builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
