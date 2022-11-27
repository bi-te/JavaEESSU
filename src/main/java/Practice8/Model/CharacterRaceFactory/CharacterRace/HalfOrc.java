package Practice8.Model.CharacterRaceFactory.CharacterRace;

import Practice8.Model.Character.Stats;
import Practice8.Model.ElementVisitor.DataElementVisitor;

import java.util.Map;

public class HalfOrc extends CharacterRace {

    public HalfOrc() {
        this.race = "Half-Orc";
        this.bonuses = new Stats(2, 0, 1, 0, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, Map<String, Object> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("It's 1:26 AM I'm too tired to think up smth");
    }

}
