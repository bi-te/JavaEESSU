package Practice8.Model.CharacterClass;

import Practice8.Model.ElementVisitor.DataElementVisitor;

import java.util.Map;

public class Fighter extends CharacterClass {
    String perk;

    public Fighter() {
        this.type = "Fighter";
        this.hp = 10;
        this.perk = "Extra Attack";
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
        return "Perk: " + perk;
    }

    @Override
    public String toString() {
        return "Fighter " +
                "hp: " + hp +
                ", type: '" + type + "' \n" +
                "perk=" + perk;
    }
}
