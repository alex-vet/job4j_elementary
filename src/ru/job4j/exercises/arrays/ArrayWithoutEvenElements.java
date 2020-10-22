package ru.job4j.exercises.arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int index = 0;
        int[] result = new int[data.length / 2];
        for (int datum : data) {
            if (datum % 2 == 0) {
                continue;
            }
            result[index++] = datum;
        }
        return result;
    }
}
