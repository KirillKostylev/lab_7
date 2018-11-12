package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LogicForVowelChecker {

    private static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'o', 'u'};
    private static final ArrayList<Character> ARRAY_LIST_VOWELS =
            new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'o', 'u'));
    private static final LinkedList<Character> LINKED_LIST_VOWELS
            = new LinkedList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'o', 'u'));
    private static final HashSet<Character> HASH_SET_VOWELS
            = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'o', 'u'));

    public static boolean switchChecker(char letter) {
        boolean result = false;
        switch (letter) {
            case 'a':
                result = true;
                break;
            case 'e':
                result = true;
                break;
            case 'i':
                result = true;
                break;
            case 'o':
                result = true;
                break;
            case 'u':
                result = true;
                break;
            case 'A':
                result = true;
                break;
            case 'E':
                result = true;
                break;
            case 'I':
                result = true;
                break;
            case 'O':
                result = true;
                break;
            case 'U':
                result = true;
        }
        return result;
    }

    public static boolean ifElseChecker1(char letter) {
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ifElseChecker2(char letter) {
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        }
        return false;
    }

    public static boolean ifElseChecker3(char letter) {
        boolean result = false;
        if (letter == 'A') {
            result = true;
        } else if (letter == 'E') {
            result = true;
        } else if (letter == 'I') {
            result = true;
        } else if (letter == 'O') {
            result = true;
        } else if (letter == 'U') {
            result = true;
        } else if (letter == 'a') {
            result = true;
        } else if (letter == 'e') {
            result = true;
        } else if (letter == 'i') {
            result = true;
        } else if (letter == 'o') {
            result = true;
        } else if (letter == 'u') {
            result = true;
        }
        return result;
    }

    public static boolean ifElseChecker4(char letter) {
        boolean result = false;
        if (letter == 'A') {
            result = true;
        }
        if (letter == 'E') {
            result = true;
        }
        if (letter == 'I') {
            result = true;
        }
        if (letter == 'O') {
            result = true;
        }
        if (letter == 'U') {
            result = true;
        }
        if (letter == 'a') {
            result = true;
        }
        if (letter == 'e') {
            result = true;
        }
        if (letter == 'i') {
            result = true;
        }
        if (letter == 'o') {
            result = true;
        }
        if (letter == 'u') {
            result = true;
        }
        return result;
    }

    public static boolean simpleChecker(char letter) {
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static boolean ternarChecker(char letter) {
        boolean result = letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
                || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ? true : false;
        return result;
    }

    public static boolean arrayChecker(char letter) {
        for (char vowel : VOWELS) {
            if (letter == vowel) {
                return true;
            }
        }
        return false;
    }


    public static boolean arrayListChecker(char letter) {
        return ARRAY_LIST_VOWELS.indexOf(letter) != -1;
    }

    public static boolean linkedListChecker(char letter) {
        return LINKED_LIST_VOWELS.contains(letter);
    }

    public static boolean hashSetChecker(char letter) {
        return HASH_SET_VOWELS.contains(letter);
    }
}

