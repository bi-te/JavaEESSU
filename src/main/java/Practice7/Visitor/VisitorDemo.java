package Practice7.Visitor;

import Practice7.Visitor.CharacterRaceFactory.HalfOrcFactory;
import Practice7.Visitor.ElementVisitor.ElementVisitor;
import Practice7.Visitor.Character.Character;
import Practice7.Visitor.CharacterClass.ClassFactory;
import Practice7.Visitor.CharacterRaceFactory.GnomeFactory;

public class VisitorDemo {
    public static void main(String[] args) {
        ElementVisitor visitor = new ElementVisitor();
        GnomeFactory gnomeFactory = new GnomeFactory();
        HalfOrcFactory halfOrcFactory = new HalfOrcFactory();

        Character bard = new Character("Ivan", ClassFactory.getClass("Bard"), gnomeFactory.create());
        bard.addClassBonuses();
        bard.addRaceBonuses();
        bard.accept(visitor);

        Character fighter = new Character("Eugen", ClassFactory.getClass("Fighter"), halfOrcFactory.create());
        fighter.addClassBonuses();
        fighter.addRaceBonuses();
        fighter.accept(visitor);
    }
}
