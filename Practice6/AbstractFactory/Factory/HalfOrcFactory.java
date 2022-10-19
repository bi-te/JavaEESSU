package Practice6.AbstractFactory.Factory;

import Practice6.AbstractFactory.CharacterRace.CharacterRace;
import Practice6.AbstractFactory.CharacterRace.HalfOrc;

public class HalfOrcFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new HalfOrc();
    }
}
