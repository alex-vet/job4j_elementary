package ru.job4j.exercises.arrays;

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

  /*      int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            rsl[k++] = left[i] < right[j] ? left[i++] :  right[j++];

        while (i < left.length)
            rsl[k++] = left[i++];

        while (j < right.length)
            rsl[k++] = right[j++];*/

        //  best solution
/*        int i = left.length - 1, j = right.length - 1, k = rsl.length;

        while (k > 0)
            rsl[--k] =
                    (j < 0 || (i >= 0 && left[i] >= right[j])) ? left[i--] : right[j--];*/
        return rsl;
    }
}
