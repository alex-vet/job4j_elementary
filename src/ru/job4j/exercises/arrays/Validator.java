package ru.job4j.exercises.arrays;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int elem : data) {
            if (elem == value) {
                count++;
            }
        }
        return count < data.length / 2;
    }
}
