package Practice6.FactoryMethod.CharacterClass;

public class Fighter extends CharacterClass{

    String perk;

    public Fighter() {
        this.type = "Fighter";
        this.hp = 10;
        this.perk = "Extra Attack";
    }

    @Override
    public void printMagika() {
        System.out.println("Perk: " + perk);
    }

    @Override
    public String toString() {
        return "Fighter " +
                "hp: " + hp +
                ", type: '" + type + "' \n" +
                "perk=" + perk;
    }
}
