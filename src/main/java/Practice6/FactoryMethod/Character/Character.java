package Practice6.FactoryMethod.Character;

import Practice6.FactoryMethod.CharacterClass.CharacterClass;

public class Character {
    private String name;
    private CharacterClass dndClass;
    private Stats attributes;

    public Character(String name, CharacterClass dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        attributes = Stats.generate();
        attributes.getStats().put("health", dndClass.getHP());
    }

    public Character(String name, CharacterClass dndClass, Stats attributes) {
        this.name = name;
        this.dndClass = dndClass;
        this.attributes = attributes;
        attributes.getStats().put("health", dndClass.getHP());
    }

    public void addClassBonuses(){
        attributes.getStats()
                .put("health",
                        dndClass.getHP() + (int)Math.floor(attributes.getStats().get("constitution") / 2.0) - 5
                );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getDndClass() {
        return dndClass;
    }

    public void setDndClass(CharacterClass dndClass) {
        this.dndClass = dndClass;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void talk(){
        System.out.println(
                "My name: " + name +
                        ", class: "     + dndClass.getType() +
                        ", attributes: " + attributes
        );

        dndClass.printMagika();
    }
}
