package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0, start = 0, end;
        for (int index = 0; index < str.length; index++) {
            if (str[index] == c) {
                end = index;
                result[commonCount] = Arrays.copyOfRange(str, start, end);
                start = index + 1;
                commonCount++;
            }
        }
        end = str.length;
        result[commonCount] = Arrays.copyOfRange(str, start, end);
        commonCount++;
        return Arrays.copyOf(result, commonCount);
    }
}
