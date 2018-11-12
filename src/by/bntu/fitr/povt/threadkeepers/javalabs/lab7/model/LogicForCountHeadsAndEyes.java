package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

public class LogicForCountHeadsAndEyes {
    public static final int FIRST_PERIOD = 200;
    public static final int NUMBER_OF_THE_HEADS_AT_THE_BEGINNING = 3;
    public static final int NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD = 3;
    public static final int NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD = 2;
    public static final int NUMBER_OF_HEADS_IN_THE_THIRD_PERIOD = 1;
    public static final int SECOND_PERIOD = 300;
    public static final int NUMBER_OF_DRAGON_EYES = 2;

    public static int findTheNumberOfHeads(int years) {
        int heads;
        if (years < FIRST_PERIOD) {
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + years * NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD;
        } else if (years < SECOND_PERIOD) {
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD
                    + (years - FIRST_PERIOD) * NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD;
        }else{
            heads = NUMBER_OF_THE_HEADS_AT_THE_BEGINNING + FIRST_PERIOD * NUMBER_OF_HEADS_IN_THE_FIRST_PERIOD
                    + (SECOND_PERIOD - FIRST_PERIOD) * NUMBER_OF_HEADS_IN_THE_SECOND_PERIOD
                    + (years - SECOND_PERIOD) * NUMBER_OF_HEADS_IN_THE_THIRD_PERIOD;
        }
        return heads;
    }

    public static int findTheNumberOfDragonsEyes(int years){
        return findTheNumberOfHeads(years) * NUMBER_OF_DRAGON_EYES;
    }

}
