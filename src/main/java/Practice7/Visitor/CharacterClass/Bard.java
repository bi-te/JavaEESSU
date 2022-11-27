package Practice7.Visitor.CharacterClass;

import Practice7.Visitor.ElementVisitor.DataElementVisitor;

import java.util.ArrayList;
import java.util.Arrays;

public class Bard extends CharacterClass {
    private final ArrayList<String> spells;

    public Bard() {
        this.type = "Bard";
        this.hp = 8;
        this.spells = new ArrayList<>(Arrays.asList("Charm Person", "Heroism"));
    }

    @Override
    public void accept(DataElementVisitor visitor) {
        visitor.visit(this);
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
