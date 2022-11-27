package Practice8.Model.CharacterRaceFactory;

import Practice8.Model.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice8.Model.CharacterRaceFactory.CharacterRace.Gnome;

public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Gnome();
    }
}
