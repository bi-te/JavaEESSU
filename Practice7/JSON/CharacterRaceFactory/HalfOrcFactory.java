package Practice7.JSON.CharacterRaceFactory;

import Practice7.JSON.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice7.JSON.CharacterRaceFactory.CharacterRace.HalfOrc;

public class HalfOrcFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new HalfOrc();
    }
}
