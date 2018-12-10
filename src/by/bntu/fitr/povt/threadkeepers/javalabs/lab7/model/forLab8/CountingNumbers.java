package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model.forLab8;

public class CountingNumbers {
    public static int count(int number) {
        int countNumb = 0;
        while (number >= 1) {
            countNumb++;
            number /= 10;
        }
        return countNumb;
    }
}
