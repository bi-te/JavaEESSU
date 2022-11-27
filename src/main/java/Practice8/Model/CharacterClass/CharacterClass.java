package Practice8.Model.CharacterClass;

import Practice8.Model.ElementVisitor.DataElement;

public abstract class CharacterClass implements DataElement {
    protected String type;
    protected int hp;

    public int getHP(){
        return  hp;
    }
    public String getType(){
        return type;
    }
    public abstract void printMagika();
    public abstract String getMagika();
}
