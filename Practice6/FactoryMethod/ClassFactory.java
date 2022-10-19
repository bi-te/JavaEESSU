package Practice6.FactoryMethod;

import Practice6.FactoryMethod.CharacterClass.Bard;
import Practice6.FactoryMethod.CharacterClass.CharacterClass;
import Practice6.FactoryMethod.CharacterClass.Fighter;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Bard" -> new Bard();
            default -> throw new IllegalArgumentException("Class type doesn't exist");
        };
    }
}
