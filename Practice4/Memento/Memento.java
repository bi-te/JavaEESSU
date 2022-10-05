package Practice4.Memento;

public class Memento {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Memento() {
    }

    public Memento(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void setState(Stats state) {
        this.strength = state.getStrength();
        this.dexterity = state.getDexterity();
        this.constitution = state.getConstitution();
        this.intelligence = state.getIntellect();
        this.wisdom = state.getWisdom();
        this.charisma = state.getCharisma();
    }

    public Stats getState(){
        return new Stats( strength, dexterity, constitution, intelligence, wisdom, charisma);
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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

    public Memento copy(){
        return new Memento(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
}
