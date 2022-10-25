package Practice7.Visitor.CharacterRaceFactory.CharacterRace;

import Practice7.Visitor.Character.Stats;
import Practice7.Visitor.ElementVisitor.DataElementVisitor;

public class Gnome extends CharacterRace {

    public Gnome() {
        this.race = "Gnome (Forest)";
        this.bonuses = new Stats(0, 1, 0, 2, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void saySMTH() {
        System.out.println("Gnomes are short - walk carefully, you giant");
    }
}
