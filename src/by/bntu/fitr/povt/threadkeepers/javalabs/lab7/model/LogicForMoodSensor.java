package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

import java.util.Random;

public class LogicForMoodSensor {

    private static final int NUMBER_OF_MOODS = 5;
    private static final String SMILE1 = "( ͡° ͜ʖ ͡°)";
    private static final String SMILE2 = "¯\\\\_(ツ)_/¯ ";
    private static final String SMILE3 = "(ง ͠° ͟ل͜ ͡°)ง";
    private static final String SMILE4 = "(ಠ_ಠ) ";
    private static final String SMILE5 = "(¬‿¬)";

    public static String getMood() {
        int moodNumber = new Random().nextInt(NUMBER_OF_MOODS-2);
        String mood = SMILE5;
        switch (moodNumber) {
            case 0:
                mood = SMILE1;
                break;
            case 1:
                mood = SMILE2;
                break;
            case 2:
                mood = SMILE3;
                break;
            case 3:
                mood = SMILE4;
        }
        return mood;
    }
}