package Practice8.Model.ElementVisitor;

import Practice8.Model.Character.Character;
import Practice8.Model.Character.Stats;
import Practice8.Model.CharacterClass.CharacterClass;
import Practice8.Model.CharacterRaceFactory.CharacterRace.CharacterRace;

import java.util.LinkedHashMap;

public interface DataElementVisitor {
    LinkedHashMap<String, Object> visit(Stats stats);
    LinkedHashMap<String, Object> visit(Character character);
    LinkedHashMap<String, Object> visit(CharacterRace characterRace);
    LinkedHashMap<String, Object> visit(CharacterClass characterClass);
}
