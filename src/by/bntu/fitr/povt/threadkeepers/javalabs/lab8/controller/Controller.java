package by.bntu.fitr.povt.threadkeepers.javalabs.lab8.controller;

import by.bntu.fitr.povt.threadkeepers.javalabs.lab8.model.NumberCheck;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools.UserInput;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

public class Controller {
    public static void execute() {
        int task = UserInput.inputIntegerPositiveData("Input task number: ");
        switch (task) {
            case 1:
                int number = UserInput.inputIntegerPositiveData("Input a natural number: ");
                View.print("Numbers in number " + number + " = " + NumberCheck.countNumbersInNumber(number));
                break;
            case 2:
                int number2 = UserInput.inputIntegerPositiveData("Input a natural number: ");
                View.print(number2 + " has repeating numbers: " + NumberCheck.checkNumberForRepeat(number2));
                break;
            case 3:
                int number3 = UserInput.inputIntegerPositiveData("Input a natural number: ");
                View.println(number3 + " is palindrome: " + NumberCheck.palindromeCheck(number3));
                break;
            case 4:
                int number4 = UserInput.inputIntegerPositiveData("Input a natural number: ");
                View.println("Max numeral in " + number4 + ": " + NumberCheck.findMaxNumeralInNumber(number4));
                break;
        }

    }
}
