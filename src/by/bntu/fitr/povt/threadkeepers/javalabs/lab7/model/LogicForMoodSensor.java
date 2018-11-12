package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

import java.util.Random;

public class LogicForMoodSensor {

    private static final int NUMBER_OF_MOODS = 5;

    public static String getMood() {
        int moodNumber = new Random().nextInt(NUMBER_OF_MOODS-1) + 1;
        String mood = "";
        switch (moodNumber) {
            case 1:
                mood = "( ͡° ͜ʖ ͡°)";
                break;
            case 2:
                mood = "¯\\\\_(ツ)_/¯ ";
                break;
            case 3:
                mood = "(ง ͠° ͟ل͜ ͡°)ง";
                break;
            case 4:
                mood = "(ಠ_ಠ) ";
                break;
            case 5:
                mood = "(¬‿¬)";
        }
        return mood;
    }
}
