package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int length = data.length * data.length;
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                if (row + cell == sum) {
                    data[row][cell] = 0;
                    length--;
                }
            }
        }
        int index = 3;
        int[] result = Arrays.copyOf(data[0], length);
        for (int row = 1; row < data.length; row++) {
            for (int cell = 0; cell < data[row].length; cell++) {
                if (data[row][cell] != 0) {
                    result[index++] = data[row][cell];
                }
            }
        }
        return result;
    }
}
