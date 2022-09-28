package Practice3.Builder;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float totalCost = 0.f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems(){
        for(Item item: items){
            System.out.println(
                    "Item: " + item.name() +
                    ", packing: " + item.packing().pack() +
                    ", price: " + item.price()
            );
        }
    }
}
