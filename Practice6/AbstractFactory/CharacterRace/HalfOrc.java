package Practice6.AbstractFactory.CharacterRace;

import Practice6.AbstractFactory.Character.Stats;

public class HalfOrc extends CharacterRace {

    public HalfOrc() {
        this.race = "Half-Orc";
        this.bonuses = new Stats(2, 0, 1, 0, 0, 0);
    }



    @Override
    public void saySMTH() {
        System.out.println("It's 1:26 AM I'm too tired to think up smth");
    }

}
