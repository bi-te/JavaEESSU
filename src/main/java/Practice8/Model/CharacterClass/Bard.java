package Practice8.Model.CharacterClass;

import Practice8.Model.ElementVisitor.DataElementVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Bard extends CharacterClass {
    private final ArrayList<String> spells;

    public Bard() {
        this.type = "Bard";
        this.hp = 8;
        this.spells = new ArrayList<>(Arrays.asList("Charm Person", "Heroism"));
    }

    @Override
    public void accept(DataElementVisitor visitor, Map<String, Object> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void printMagika() {
        System.out.println(getMagika());
    }

    @Override
    public String getMagika() {
        return "Abilities: " + String.join(", ", spells);
    }

    @Override
    public String toString() {
        return "Bard " +
                "hp: " + hp +
                ", type: '" + type + "' \n" +
                "spells=" + String.join(", ", spells);
    }
}
