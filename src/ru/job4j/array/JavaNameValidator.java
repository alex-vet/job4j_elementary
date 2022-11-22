package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            int code = name.charAt(i);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code)
                    && !isDigit(code)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 121;
    }
}
