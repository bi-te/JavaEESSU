package Practice8.Model.CharacterRaceFactory;

import Practice8.Model.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice8.Model.CharacterRaceFactory.CharacterRace.HalfOrc;

public class HalfOrcFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new HalfOrc();
    }
}
