package Practice7.Visitor.CharacterClass;

import Practice7.Visitor.ElementVisitor.DataElement;

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
}
