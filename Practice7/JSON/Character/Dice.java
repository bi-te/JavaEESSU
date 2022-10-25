package Practice7.JSON.Character;

import java.util.Random;

public class Dice {
    public static int rollD6Stat(){
        final int rolls = 4;
        Random rand = new Random();
        int minDiceValue = Integer.MAX_VALUE;
        int res = 0;

        for(int roll = 0; roll < rolls; roll++){
            int rollRes = rand.nextInt(6) + 1;
            res += rollRes;
            minDiceValue = Math.min(minDiceValue, rollRes);
        }
        res -= minDiceValue;
        return res;
    }

    public static int rollD6StatsBad(){
        return new Random().nextInt(18) + 1;
    }
}
