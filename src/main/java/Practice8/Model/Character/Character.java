package Practice8.Model.Character;

import Practice8.Model.CharacterClass.CharacterClass;
import Practice8.Model.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice8.Model.ElementVisitor.DataElement;
import Practice8.Model.ElementVisitor.DataElementVisitor;

import java.util.Map;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndClass;
    private CharacterRace race;
    private Stats attributes;

    public Character() {
    }

    public Character(String name, CharacterClass dndClass, CharacterRace race) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
        this.attributes = Stats.generate();
    }

    public Character(String name, CharacterClass dndClass, CharacterRace race, Stats attributes) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
        this.attributes = attributes;
    }

    @Override
    public void accept(DataElementVisitor visitor, Map<String, Object> map) {
        map.putAll(visitor.visit(this));
        map.putAll(visitor.visit(race));
        map.putAll(visitor.visit(dndClass));
        map.putAll(visitor.visit(attributes));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
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

    public void addRaceBonuses(){
        for(String bonus: race.getBonuses().getStats().keySet()){
            attributes.getStats().put(bonus, attributes.getStats().get(bonus) + race.getBonuses().getStats().get(bonus));
        }
    }

    public void addClassBonuses(){
        attributes.getStats()
                .put("health",
                        dndClass.getHP() + (int)Math.floor(attributes.getStats().get("constitution") / 2.0) - 5
                );
    }

    public void talk(){
        System.out.println(
                "My name: " + name +
                        ", race: "     + race.getRace() +
                        ", class: "     + dndClass.getType() +
                        ", attributes: " + attributes
        );

//        race.print();
//        race.saySMTH();
        dndClass.printMagika();
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nClass: " + getDndClass().getType() +
                "\nRace: " + getRace().getRace() +
                "\n" + getDndClass().getMagika() +
                "\nAttributes: " + getAttributes().toString();
    }
}
