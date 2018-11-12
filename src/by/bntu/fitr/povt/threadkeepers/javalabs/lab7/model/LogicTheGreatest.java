package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

public class LogicTheGreatest {

    public static String theGreatest(double a, double b, double c) {
        String ans;
        if (isEquals(a, b) && isEquals(a, c)) {
            ans = "Max element: a = b = c =" + a + " ";
        } else if (isEquals(a, b) && findMaxNumber(a, b, c) == a) {
            ans = "Max element: a = b = " + a;
        } else if (isEquals(a, c) && findMaxNumber(a, b, c) == a) {
            ans = "Max element: a = c = " + a;
        } else if (isEquals(b, c) && findMaxNumber(a, b, c) == b) {
            ans = "Max element: b = c = " + b;
        } else {
            ans = "Max element: " + findMaxNumber(a, b, c);
        }
        return ans;
    }

    public static double findMaxNumber(double a, double b, double c) {
        return maxNumber(maxNumber(a, b), c);
    }

    public static double maxNumber(double a, double b) {
        return (a > b) ? a : b;
    }

    public static boolean isEquals(double a, double b) {
        return a == b;
    }

}
