package Practice4.Memento;

public class Character {
    private String name;
    private String dndClass;
    private String race;
    private Stats attributes;

    public Character(String name, String dndClass, String race) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
    }

    public Character(String name, String dndClass, String race, Stats attributes) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDndClass() {
        return dndClass;
    }

    public void setDndClass(String dndClass) {
        this.dndClass = dndClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void printSheet(){
        System.out.println(
                "Character: " + name +
                "\nClass: "     + dndClass +
                "\nRace: "      + race
        );
        attributes.print();
    }
}
