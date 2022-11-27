package Practice7.JSON;

import Practice7.JSON.Character.Character;
import Practice7.JSON.CharacterClass.ClassFactory;
import Practice7.JSON.CharacterRaceFactory.GnomeFactory;
import Practice7.JSON.CharacterRaceFactory.HalfOrcFactory;
import Practice7.JSON.ElementVisitor.ElementVisitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class JSONDemo {
    public static void main(String[] args){
        ElementVisitor visitor = new ElementVisitor();
        GnomeFactory gnomeFactory = new GnomeFactory();
        HalfOrcFactory halfOrcFactory = new HalfOrcFactory();

        ArrayList<TreeMap<String, String>> charactersData = new ArrayList<>();
        TreeMap<String, String> characterData;

        try(FileWriter output = new FileWriter("output.json")){

            characterData = new TreeMap<>();
            Character bard = new Character("Artem", ClassFactory.getClass("Bard"), gnomeFactory.create());
            bard.addClassBonuses();
            bard.addRaceBonuses();
            bard.accept(visitor, characterData);

            charactersData.add(characterData);

            characterData = new TreeMap<>();
            Character fighter = new Character("Eugen", ClassFactory.getClass("Fighter"), halfOrcFactory.create());
            fighter.addClassBonuses();
            fighter.addRaceBonuses();
            fighter.accept(visitor, characterData);
            charactersData.add(characterData);


            JSONArray jsonArray = new JSONArray();
            jsonArray.addAll(charactersData);
            output.write(jsonArray.toJSONString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
