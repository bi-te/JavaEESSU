package Practice6.AbstractFactory;

import Practice6.AbstractFactory.CharacterRace.CharacterRace;
import Practice6.AbstractFactory.Factory.GnomeFactory;
import Practice6.AbstractFactory.Factory.HalfOrcFactory;
import Practice6.AbstractFactory.Factory.RaceAbstractFactory;
import Practice6.AbstractFactory.Character.Character;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory;

        raceAbstractFactory = new GnomeFactory();
        Character gnome = new Character("Bogdan", raceAbstractFactory.create());
        gnome.addRaceBonuses();
        gnome.talk();

        raceAbstractFactory = new HalfOrcFactory();
        Character halfOrc = new Character("Gena", raceAbstractFactory.create());
        halfOrc.addRaceBonuses();
        halfOrc.talk();
    }
}
