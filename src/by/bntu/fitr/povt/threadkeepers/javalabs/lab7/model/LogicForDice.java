package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;


import java.util.Random;


public class LogicForDice {


    private static final int NUMBER_OF_FACES = 6;


    public static String rollDice() {
        int firstDie = rollDie();
        int secondDie = rollDie();
        return String.valueOf(firstDie) + " + " + String.valueOf(secondDie) + " = " + (firstDie + secondDie);
    }


    private static int rollDie() {
        return new Random().nextInt(NUMBER_OF_FACES - 1) + 1;
    }
}
