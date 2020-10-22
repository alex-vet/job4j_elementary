package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        boolean exist;
        int[] rsl = new int[0];
        for (int elLeft : left) {
            exist = false;
            for (int elRight : right) {
                if (elLeft == elRight) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = elLeft;
            }
        }
        for (int elR : right) {
            exist = false;
            for (int elL : left) {
                if (elR == elL) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = elR;
            }
        }
        return rsl;
    }
}
