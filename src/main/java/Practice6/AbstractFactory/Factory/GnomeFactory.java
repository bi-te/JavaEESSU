package Practice6.AbstractFactory.Factory;

import Practice6.AbstractFactory.CharacterRace.CharacterRace;
import Practice6.AbstractFactory.CharacterRace.Gnome;

public class GnomeFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Gnome();
    }
}
