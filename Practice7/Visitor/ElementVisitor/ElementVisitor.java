package Practice7.Visitor.ElementVisitor;

import Practice7.Visitor.Character.Character;
import Practice7.Visitor.Character.Stats;
import Practice7.Visitor.CharacterClass.CharacterClass;
import Practice7.Visitor.CharacterRaceFactory.CharacterRace.CharacterRace;

public class ElementVisitor implements DataElementVisitor {
    @Override
    public void visit(Stats stats) {
        System.out.println("Stats: " + stats.getStats());
    }

    @Override
    public void visit(Character character) {
        System.out.println("Character name: " + character.getName());
    }

    @Override
    public void visit(CharacterRace characterRace) {
        System.out.println("Race: " + characterRace.getRace() + ", bonuses: " + characterRace.getBonuses());
    }

    @Override
    public void visit(CharacterClass characterClass) {
        System.out.println("Class: " + characterClass.getType() + ", initial hp: " + characterClass.getHP());
    }
}
