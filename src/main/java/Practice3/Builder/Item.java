package Practice3.Builder;

import Practice3.Builder.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
