package Practice7.Visitor.ElementVisitor;

import Practice7.Visitor.Character.Character;
import Practice7.Visitor.Character.Stats;
import Practice7.Visitor.CharacterClass.CharacterClass;
import Practice7.Visitor.CharacterRaceFactory.CharacterRace.CharacterRace;

public interface DataElementVisitor {
    void visit(Stats stats);
    void visit(Character character);
    void visit(CharacterRace characterRace);
    void visit(CharacterClass characterClass);
}
