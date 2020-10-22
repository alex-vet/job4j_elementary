package ru.job4j.exercises.arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + middle.length / 2 + right.length / 2];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int index = 1; index < result.length - 1; index++) {
            result[index] = index % 2 == 0 ? middle[index - 1] : right[index - 1];
        }
        return result;
    }
}
