package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.controller;

import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.forLab8.CountingNumbers;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools.UserInput;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

public class Controller2 {
    public static void execute() {
        int task = UserInput.inputIntegerPositiveData("Input task number: ");
        switch (task) {
            case 1:
                int number = UserInput.inputIntegerPositiveData("Input a natural number: ");
                View.print("Numbers in number "+ number + " = "+ CountingNumbers.count(number));
                break;
        }
    }
}
