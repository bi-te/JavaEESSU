package Practice6.FactoryMethod.CharacterClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Bard extends CharacterClass{

    private ArrayList<String> spells;

    public Bard() {
        this.type = "Bard";
        this.hp = 8;
        this.spells = new ArrayList<>(Arrays.asList("Charm Person", "Heroism"));
    }

    @Override
    public void printMagika() {
        System.out.println("Abilities: " + String.join(", ", spells));
    }

    @Override
    public String toString() {
        return "Bard " +
                "hp: " + hp +
                ", type: '" + type + "' \n" +
                "spells=" + String.join(", ", spells);
    }
}
