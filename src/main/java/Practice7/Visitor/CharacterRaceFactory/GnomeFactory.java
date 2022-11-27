package Practice7.Visitor.CharacterRaceFactory;

import Practice7.Visitor.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice7.Visitor.CharacterRaceFactory.CharacterRace.Gnome;

public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Gnome();
    }
}
