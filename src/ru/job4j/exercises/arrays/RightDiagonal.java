package ru.job4j.exercises.arrays;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] result = new int[data.length];
        int index = 0;
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                if (row + cell == data.length - 1) {
                    result[index++] = data[row][cell];
                }
            }
        }
        return result;
    }
}
