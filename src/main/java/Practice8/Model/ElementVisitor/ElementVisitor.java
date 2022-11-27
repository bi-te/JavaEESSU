package Practice8.Model.ElementVisitor;

import Practice8.Model.Character.Character;
import Practice8.Model.Character.Stats;
import Practice8.Model.CharacterClass.CharacterClass;
import Practice8.Model.CharacterRaceFactory.CharacterRace.CharacterRace;

import java.util.LinkedHashMap;

public class ElementVisitor implements DataElementVisitor {
    @Override
    public LinkedHashMap<String, Object> visit(Stats stats) {
        LinkedHashMap<String, Object> LinkedHashMap = new LinkedHashMap<>();
        for(String key: stats.getStats().keySet()){
            LinkedHashMap.put(key, stats.getStats().get(key).toString());
        }

        LinkedHashMap<String, Object> res = new LinkedHashMap<>();
        res.put("Attributes", LinkedHashMap);

        return res;
    }

    @Override
    public LinkedHashMap<String, Object> visit(Character character) {
        LinkedHashMap<String, Object>  res = new LinkedHashMap<>();
        res.put("Name", character.getName());
        return res;
    }

    @Override
    public LinkedHashMap<String, Object> visit(CharacterRace characterRace) {
        LinkedHashMap<String, Object>  res = new LinkedHashMap<>();
        res.put("Race", characterRace.getRace());
        return res;
    }

    @Override
    public LinkedHashMap<String, Object> visit(CharacterClass characterClass) {
        LinkedHashMap<String, Object>  res = new LinkedHashMap<>();
        res.put("Class", characterClass.getType());
        return res;
    }
}
