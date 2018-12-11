package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools;

import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

import java.util.Scanner;

public class UserInput {
    public static String ERROR_MESSAGE = "Input error, all written below is false, the program doesn't work\n";
    private static Scanner scanner = new Scanner(System.in);

    public static int inputIntegerPositiveData(String string) {
        int number = 0;
        View.print(string);
        try {
            number = scanner.nextInt();
            if (number < 0) throw new Exception();
        } catch (Exception e) {
            View.print(ERROR_MESSAGE);
        }
        return number;
    }

    public static double inputDoubleData(String string) {
        double number = 0;
        View.print(string);
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            View.print(ERROR_MESSAGE);
        }
        return number;
    }

    public static char inputChar(String string) {
        char letter = 0;
        String input;
        View.print(string);
        try {
            input = scanner.next();
            if (input.length() != 1) throw new Exception();
            letter = input.charAt(0);
            if (letter < 65 || letter > 90 && letter < 97 || letter > 122) throw new Exception();
        } catch (Exception e) {
            View.print(ERROR_MESSAGE);
        }
        return letter;
    }
}
