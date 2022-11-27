package Practice6.FactoryMethod.Character;

import java.util.HashMap;

public class Stats {
    private HashMap<String, Integer> stats;

    public Stats() {
        stats = new HashMap<>();
    }

    public static Stats generate(){
        Stats result = new Stats();

        result.stats.put("strength", Dice.rollD6Stat());
        result.stats.put("dexterity", Dice.rollD6Stat());
        result.stats.put("constitution", Dice.rollD6Stat());
        result.stats.put("intellect", Dice.rollD6Stat());
        result.stats.put("wisdom", Dice.rollD6Stat());
        result.stats.put("charisma", Dice.rollD6Stat());

        return result;
    }

    public HashMap<String, Integer> getStats(){
        return stats;
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
