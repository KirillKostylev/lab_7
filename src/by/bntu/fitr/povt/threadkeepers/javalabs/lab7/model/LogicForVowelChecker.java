package by.bntu.fitr.povt.threadkeepers.javalabs.lab7.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LogicForVowelChecker {

    private static final char[] VOWELS = {'a', 'e', 'o', 'u'};
    private static final ArrayList<Character> ARRAY_LIST_VOWELS =
            new ArrayList<>(Arrays.asList('a', 'e', 'o', 'u'));
    private static final LinkedList<Character> LINKED_LIST_VOWELS
            = new LinkedList<>(Arrays.asList('a', 'e', 'o', 'u'));
    private static final HashSet<Character> HASH_SET_VOWELS
            = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u'));
    public static final String STRING_OF_VOWELS = "aeou";

    public static boolean switchChecker(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }


    public static boolean ifElseChecker2(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        }
        return false;
    }

    public static boolean simpleChecker(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static boolean arrayChecker(char letter) {
        for (char vowel : VOWELS) {
            if (letter == vowel) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringChecker(char letter) {
        return STRING_OF_VOWELS.contains(letter + "");
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

    public static String isVowel(boolean vowel) {
        return vowel ? "vowel" : "consonant";
    }
}
