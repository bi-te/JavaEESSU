package Practice7.JSON.ElementVisitor;

import Practice7.JSON.Character.Character;
import Practice7.JSON.Character.Stats;
import Practice7.JSON.CharacterClass.CharacterClass;
import Practice7.JSON.CharacterRaceFactory.CharacterRace.CharacterRace;

import java.util.TreeMap;

public interface DataElementVisitor {
    TreeMap<String, String> visit(Stats stats);
    TreeMap<String, String> visit(Character character);
    TreeMap<String, String> visit(CharacterRace characterRace);
    TreeMap<String, String> visit(CharacterClass characterClass);
}
