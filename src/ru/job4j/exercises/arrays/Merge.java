package ru.job4j.exercises.arrays;

/**
 * Упражнения
 * merge - my first solution
 * merge2 - short solution
 * merge3 - best solution
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int indexLeft = 0, indexRight = 0, k = 0;
        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                rsl[k] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[k] = right[indexRight];
                indexRight++;
            }
            k++;
        }

        while (indexLeft < left.length) {
            rsl[k] = left[indexLeft];
            indexLeft++;
            k++;
        }

        while (indexRight < right.length) {
            rsl[k] = right[indexRight];
            indexRight++;
            k++;
        }
        return rsl;
    }

    public static int[] merge2(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            rsl[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }

        while (i < left.length) {
            rsl[k++] = left[i++];
        }

        while (j < right.length) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }

    public static int[] merge3(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = left.length - 1, j = right.length - 1, k = rsl.length;

        while (k > 0) {
            rsl[--k] =
                    (j < 0 || (i >= 0 && left[i] >= right[j])) ? left[i--] : right[j--];
        }
        return rsl;
    }
}
