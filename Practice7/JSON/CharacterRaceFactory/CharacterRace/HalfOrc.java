package Practice7.JSON.CharacterRaceFactory.CharacterRace;

import Practice7.JSON.Character.Stats;
import Practice7.JSON.ElementVisitor.DataElementVisitor;

import java.util.TreeMap;

public class HalfOrc extends CharacterRace {

    public HalfOrc() {
        this.race = "Half-Orc";
        this.bonuses = new Stats(2, 0, 1, 0, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, TreeMap<String, String> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("It's 1:26 AM I'm too tired to think up smth");
    }

}
