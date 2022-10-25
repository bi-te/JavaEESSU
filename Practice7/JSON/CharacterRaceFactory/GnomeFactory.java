package Practice7.JSON.CharacterRaceFactory;

import Practice7.JSON.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice7.JSON.CharacterRaceFactory.CharacterRace.Gnome;

public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Gnome();
    }
}
