package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.forLab8;

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
}
