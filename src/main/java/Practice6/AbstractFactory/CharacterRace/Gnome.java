package Practice6.AbstractFactory.CharacterRace;

import Practice6.AbstractFactory.Character.Stats;

public class Gnome extends CharacterRace{

    public Gnome() {
        this.race = "Gnome (Forest)";
        this.bonuses = new Stats(0, 1, 0, 2, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Gnomes are short - walk carefully, you giant");
    }
}
