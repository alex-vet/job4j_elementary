package ru.job4j.exercises.arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int length = 0;
        int index = 0;
        double arraySize;
        for (int[] row : array) {
            length = length + row.length;
        }
        arraySize = Math.sqrt(length);
        length = length == Math.pow((int) arraySize, 2) ? (int) arraySize : (int) arraySize + 1;
        int[][] result = new int[length][length];
        for (int[] row : array) {
            for (int cell : row) {
                result[index / result.length][index % result.length] = cell;
                index++;
            }
        }
        return result;
    }
}
