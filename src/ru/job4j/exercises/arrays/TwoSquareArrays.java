package ru.job4j.exercises.arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * right.length];
        for (int index = 0; index < result.length; index++) {
            result[index] = Math.max(left[index / (left.length)][index % (left.length)],
                    right[index / (right.length)][index % (right.length)]);
        }
        return result;
    }
}
