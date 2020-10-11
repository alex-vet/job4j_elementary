package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int length = array.length;
        int middle = length / 2;
        for (int index = 0; index < middle; index++) {
            int mirrorIndex = length - index - 1;
            int temp = array[mirrorIndex];
            array[mirrorIndex] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
