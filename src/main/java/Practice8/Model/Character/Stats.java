package Practice8.Model.Character;

import Practice8.Model.ElementVisitor.DataElement;
import Practice8.Model.ElementVisitor.DataElementVisitor;

import java.util.HashMap;
import java.util.Map;

public class Stats implements DataElement {

    private HashMap<String, Integer> stats;

    public Stats() {
        stats = new HashMap<>();
    }

    public Stats(Stats stats){
        this.stats = new HashMap<>();

        this.stats.put("strength", stats.getStats().get("strength"));
        this.stats.put("dexterity", stats.getStats().get("dexterity"));
        this.stats.put("constitution", stats.getStats().get("constitution"));
        this.stats.put("intellect", stats.getStats().get("intellect"));
        this.stats.put("wisdom", stats.getStats().get("wisdom"));
        this.stats.put("charisma", stats.getStats().get("charisma"));
    }

    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        stats = new HashMap<>();

        stats.put("strength", strength);
        stats.put("dexterity", dexterity);
        stats.put("constitution", constitution);
        stats.put("intellect", intellect);
        stats.put("wisdom", wisdom);
        stats.put("charisma", charisma);
    }

    public static Stats generate(){
        Stats result = new Stats();

        result.stats.put("strength", Practice6.FactoryMethod.Character.Dice.rollD6Stat());
        result.stats.put("dexterity", Practice6.FactoryMethod.Character.Dice.rollD6Stat());
        result.stats.put("constitution", Practice6.FactoryMethod.Character.Dice.rollD6Stat());
        result.stats.put("intellect", Practice6.FactoryMethod.Character.Dice.rollD6Stat());
        result.stats.put("wisdom", Practice6.FactoryMethod.Character.Dice.rollD6Stat());
        result.stats.put("charisma", Practice6.FactoryMethod.Character.Dice.rollD6Stat());

        return result;
    }

    public HashMap<String, Integer> getStats(){
        return stats;
    }

    @Override
    public void accept(DataElementVisitor visitor, Map<String, Object> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String stat: stats.keySet()){
            int value = stats.get(stat);

            stringBuilder.append("\n    ").append(stat).append(": ").append(value);
        }

        return stringBuilder.toString();
    }
}
