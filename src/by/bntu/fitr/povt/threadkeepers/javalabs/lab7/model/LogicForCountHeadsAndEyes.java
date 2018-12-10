package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

public class LogicForCountHeadsAndEyes {
    private static final int FIRST_PERIOD = 200;
    private static final int NUMBER_OF_THE_HEADS_AT_THE_BEGINNING = 3;
    private static final int NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD = 3;
    private static final int NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD = 2;
    private static final int NUMBER_OF_HEADS_IN_THE_THIRD_PERIOD = 1;
    private static final int SECOND_PERIOD = 300;
    private static final int NUMBER_OF_DRAGON_EYES = 2;

    public static int findTheNumberOfHeads(int age) {
        int heads;
        if (age < FIRST_PERIOD) {
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD * age;
        } else if (age < SECOND_PERIOD) {
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD
                    - FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD
                    + age * NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD;
        } else {
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD
                    + NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD * SECOND_PERIOD
                    - FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD
                    - SECOND_PERIOD * NUMBER_OF_HEADS_IN_THE_THIRD_PERIOD
                    + age * NUMBER_OF_HEADS_IN_THE_THIRD_PERIOD;
        }
        return heads;
    }

    public static int findTheNumberOfDragonsEyes(int age) {
        return findTheNumberOfHeads(age) * NUMBER_OF_DRAGON_EYES;
    }

}
