package ru.job4j.exercises.arrays;

public class Sorted {
    public static boolean isSorted(int[] array) {
        int elem = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < elem) {
                return false;
            }
            elem = array[index];
        }
        return true;
    }
}
