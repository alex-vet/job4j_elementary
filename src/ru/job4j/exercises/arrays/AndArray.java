package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[0];
        for (int elLeft : left) {
            for (int elRight : right) {
                if (elLeft == elRight) {
                    rsl = Arrays.copyOf(rsl, rsl.length + 1);
                    rsl[rsl.length - 1] = elLeft;
                    break;
                }
            }
        }
        return rsl;
    }
}
