package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.controller;


import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.*;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.tools.UserInput;
import by.bntu.fitr.povt.threadkeepers.javalabs.lab7.view.View;

class Controller {
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
                break;
            case 3:
                View.print("Your mood now:\n" + LogicForMoodSensor.getMood());
                break;
            case 4:
                View.print("The number of the dice: " + LogicForDice.rollDice());
                break;
            case 5:
                char letter = UserInput.inputChar("Input a letter: " +
                        "");
                View.println("Is letter vowel: ");
                View.println("" + LogicForVowelChecker.arrayChecker(letter));
                View.println("" + LogicForVowelChecker.arrayListChecker(letter));
                View.println("" + LogicForVowelChecker.hashSetChecker(letter));
                View.println("" + LogicForVowelChecker.ifElseChecker1(letter));
                View.println("" + LogicForVowelChecker.ifElseChecker2(letter));
                View.println("" + LogicForVowelChecker.ifElseChecker3(letter));
                View.println("" + LogicForVowelChecker.ifElseChecker4(letter));
                View.println("" + LogicForVowelChecker.linkedListChecker(letter));
                View.println("" + LogicForVowelChecker.simpleChecker(letter));
                View.println("" + LogicForVowelChecker.switchChecker(letter));
                View.println("" + LogicForVowelChecker.ternarChecker(letter));


        }
    }
}

