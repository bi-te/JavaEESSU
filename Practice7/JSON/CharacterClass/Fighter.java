package Practice7.JSON.CharacterClass;

import Practice7.JSON.ElementVisitor.DataElementVisitor;

import java.util.TreeMap;

public class Fighter extends CharacterClass {
    String perk;

    public Fighter() {
        this.type = "Fighter";
        this.hp = 10;
        this.perk = "Extra Attack";
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void printMagika() {
        System.out.println("Perk: " + perk);
    }

    @Override
    public String toString() {
        return "Fighter " +
                "hp: " + hp +
                ", type: '" + type + "' \n" +
                "perk=" + perk;
    }
}
