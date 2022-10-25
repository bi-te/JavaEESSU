package Practice7.Visitor.Character;

import Practice7.Visitor.CharacterClass.CharacterClass;
import Practice7.Visitor.CharacterRaceFactory.CharacterRace.CharacterRace;
import Practice7.Visitor.ElementVisitor.DataElement;
import Practice7.Visitor.ElementVisitor.DataElementVisitor;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndClass;
    private CharacterRace race;
    private Stats attributes;

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
    public void accept(DataElementVisitor visitor) {
        visitor.visit(this);
        visitor.visit(race);
        visitor.visit(dndClass);
        visitor.visit(attributes);
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

    public void setRace(CharacterRace dndClass) {
        this.race = dndClass;
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
}
