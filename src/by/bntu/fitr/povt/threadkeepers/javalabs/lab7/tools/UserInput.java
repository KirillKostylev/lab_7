package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools;

import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

import java.util.Scanner;

public class UserInput {

    public static int inputIntegerPositiveData(String string) {
        int number;
        View.print(string);
        try {
            number = new Scanner(System.in).nextInt();
            if (number < 0) throw new Exception();
        } catch (Exception e) {
            View.print("Input error, all written below is false, the program does not work\n");
            number = 0;
        }
        return number;
    }

    public static double inputDoubleData(String string) {
        double number;
        View.print(string);
        try {
            number = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            View.print("Input error, all written below is false, the program does not work\n");
            number = 0;
        }
        return number;
    }

    public static char inputChar (String string) {
        char letter;
        String input;
        View.print(string);
        try {
            input = new Scanner(System.in).next();
            if (input.length() != 1) throw new Exception();
            letter = input.charAt(0);
            if (letter < 65 || letter > 90 && letter < 97 || letter > 122) throw new Exception();
        } catch (Exception e) {
            View.print("Input error, all written below is false, the program does not work\n");
            letter = 0;
        }
        return letter;
    }
}
