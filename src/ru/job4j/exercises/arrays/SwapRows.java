package ru.job4j.exercises.arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] sourceArray = data[src];
        data[src] = data[dst];
        data[dst] = sourceArray;
    }
}
