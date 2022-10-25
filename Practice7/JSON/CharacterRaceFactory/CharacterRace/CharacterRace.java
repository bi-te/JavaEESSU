package Practice7.JSON.CharacterRaceFactory.CharacterRace;

import Practice7.JSON.Character.Stats;
import Practice7.JSON.ElementVisitor.DataElement;

public abstract class CharacterRace implements DataElement {
    String race;
    Stats bonuses;

    public Stats getBonuses(){
        return bonuses;
    }

    public String getRace(){
        return race;
    }

    public void print(){
        System.out.println(race + "'s bonuses are: ");
        for(String bonus: bonuses.getStats().keySet()){
            int value = bonuses.getStats().get(bonus);
            if(value > 0){
                System.out.println("    " + bonus + ": " + value);
            }
        }
    }
    public abstract void saySMTH();
}
