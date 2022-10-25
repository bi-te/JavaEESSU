package Practice7.JSON.CharacterRaceFactory.CharacterRace;

import Practice7.JSON.Character.Stats;
import Practice7.JSON.ElementVisitor.DataElementVisitor;

import java.util.TreeMap;

public class Gnome extends CharacterRace {

    public Gnome() {
        this.race = "Gnome (Forest)";
        this.bonuses = new Stats(0, 1, 0, 2, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("Gnomes are short - walk carefully, you giant");
    }
}
