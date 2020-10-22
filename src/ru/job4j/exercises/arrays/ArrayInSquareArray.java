package ru.job4j.exercises.arrays;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.sqrt(array.length) + 1;
        int[][] result = new int[size][size];
        for (int index = 0; index < array.length; index++) {
            result[index / result.length][index  % result.length] = array[index];
        }
        return result;
    }
}
