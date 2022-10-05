package Practice4.Memento;

public class Stats {
    int strength;
    int dexterity;
    int constitution;
    int intellect;
    int wisdom;
    int charisma;

    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public static Stats generate(){
        return new Stats(
                Dice.rollD6Stat(),
                Dice.rollD6Stat(),
                Dice.rollD6Stat(),
                Dice.rollD6Stat(),
                Dice.rollD6Stat(),
                Dice.rollD6Stat()
        );
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void print(){
        System.out.println("-------Stats-------" +
                "\nStrength=" + strength +
                "\nDexterity=" + dexterity +
                "\nConstitution=" + constitution +
                "\nIntellect=" + intellect +
                "\nWisdom=" + wisdom +
                "\nCharisma=" + charisma);
    }

    @Override
    public String toString() {
        return "Stats{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
