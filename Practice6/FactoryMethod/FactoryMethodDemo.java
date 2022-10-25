package Practice6.FactoryMethod;

import Practice6.FactoryMethod.Character.Character;
import Practice6.FactoryMethod.ClassFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Character fighter = new Character("Ivan", ClassFactory.getClass("Fighter"));
        fighter.talk();

        fighter.addClassBonuses();
        fighter.talk();

        Character bard = new Character("Andrey", ClassFactory.getClass("Bard"));
        bard.talk();

        bard.addClassBonuses();
        bard.talk();
    }
}
