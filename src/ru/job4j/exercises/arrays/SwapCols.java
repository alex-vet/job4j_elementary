package ru.job4j.exercises.arrays;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == src) {
                    temp = data[i][j];
                } else if (j == dst) {
                    data[i][src] = data[i][dst];
                    data[i][dst] = temp;
                }
            }
        }
    }
}
