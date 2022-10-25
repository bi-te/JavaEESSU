package Practice7.Visitor.CharacterClass;

import Practice7.Visitor.CharacterClass.Bard;
import Practice7.Visitor.CharacterClass.CharacterClass;
import Practice7.Visitor.CharacterClass.Fighter;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Bard" -> new Bard();
            default -> throw new IllegalArgumentException("Class type doesn't exist");
        };
    }
}
