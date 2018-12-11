package by.bntu.fitr.povt.threadkeepers.javalabs.lab8.model;

public class NumberCheck {

    public static int countNumbersInNumber(int number) {
        int countNumber = 0;
        while (number >= 1) {
            countNumber++;
            number /= 10;
        }
        return countNumber;
    }

    public static boolean checkNumberForRepeat(int number) {
        int counter = 0;
        int numberCopy1 = number;

        label:
        while (numberCopy1 >= 1) {
            int temp1 = numberCopy1 % 10;
            numberCopy1 /= 10;

            int numberCopy2 = number;
            counter = 0;
            while (numberCopy2 >= 1) {
                int temp2 = numberCopy2 % 10;
                numberCopy2 /= 10;
                if (temp1 == temp2) {
                    counter++;
                }
                if (counter > 1) {
                    break label;
                }
            }
        }
        return counter > 1;
    }

    public static boolean palindromeCheck(int number) {
        int firstNumber = number;
        int secondNumber = 0;
        while (firstNumber >= 1) {
            int tempNumeral = firstNumber % 10;
            secondNumber *= 10;
            secondNumber += tempNumeral;

            firstNumber /= 10;
        }
        return number == secondNumber;
    }

    public static int findMaxNumeralInNumber(int number) {
        int maxNumeral = number % 10;
        while (number >= 1) {
            number /= 10;
            int tempNumeral = number % 10;
            maxNumeral = (maxNumeral > tempNumeral) ? maxNumeral : tempNumeral;
        }
        return maxNumeral;
    }
}