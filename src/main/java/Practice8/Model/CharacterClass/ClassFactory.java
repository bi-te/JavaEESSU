package Practice8.Model.CharacterClass;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Bard" -> new Bard();
            default -> throw new IllegalArgumentException("Class type doesn't exist");
        };
    }
}
