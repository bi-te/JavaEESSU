package Practice7.Visitor.CharacterRaceFactory.CharacterRace;

import Practice7.Visitor.Character.Stats;
import Practice7.Visitor.ElementVisitor.DataElementVisitor;

public class HalfOrc extends CharacterRace {

    public HalfOrc() {
        this.race = "Half-Orc";
        this.bonuses = new Stats(2, 0, 1, 0, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void saySMTH() {
        System.out.println("It's 1:26 AM I'm too tired to think up smth");
    }

}
