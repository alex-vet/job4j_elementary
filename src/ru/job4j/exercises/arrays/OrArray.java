package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        boolean exist;
        int[] rsl = Arrays.copyOf(left, left.length);
        for (int el : right) {
            exist = false;
            for (int i : rsl) {
                if (el == i) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = el;
            }
        }
        return rsl;
    }
}
