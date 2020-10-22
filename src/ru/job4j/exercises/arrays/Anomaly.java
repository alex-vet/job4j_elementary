package ru.job4j.exercises.arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                int[] temp = new int[2];
                temp[0] = i;
                while (data[i] >= up || data[i] <= down) {
                    temp[1] = i++;
                    if (i > data.length - 1) {
                        break;
                    }
                }
                result[count++] = temp;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
