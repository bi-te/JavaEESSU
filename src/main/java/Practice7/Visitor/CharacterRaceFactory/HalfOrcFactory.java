package Practice7.Visitor.CharacterRaceFactory;

import Practice7.Visitor.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice7.Visitor.CharacterRaceFactory.CharacterRace.HalfOrc;

public class HalfOrcFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new HalfOrc();
    }
}
