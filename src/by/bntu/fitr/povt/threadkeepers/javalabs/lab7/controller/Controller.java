package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.controller;


import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.LogicForCountHeadsAndEyes;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.LogicTheGreatest;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools.UserInput;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

public class Controller {
    static void execute() {
        int task = UserInput.inputIntegerPositiveData("Input task number: ");
        switch (task) {
            case 1:
                int number = UserInput.inputIntegerPositiveData("Input number of years ща of dragon: ");
                View.print("Number of dragon heads " + LogicForCountHeadsAndEyes.findTheNumberOfHeads(number) + '\n');
                View.print("Number of dragon eyes " + LogicForCountHeadsAndEyes.findTheNumberOfDragonsEyes(number)
                        + '\n');
                break;
            case 2:
                double a = UserInput.inputDoubleData("Input the first number ");
                double b = UserInput.inputDoubleData("Input the second number ");
                double c = UserInput.inputDoubleData("Input the third number ");
               View.print(LogicTheGreatest.theGreatest(a, b, c));

        }
    }
}

