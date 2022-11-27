package Practice6.FactoryMethod.CharacterClass;

public abstract class CharacterClass {
    protected String type;
    protected int hp;

    public int getHP(){
        return  hp;
    }
    public String getType(){
        return type;
    }
    public abstract void printMagika();
}
