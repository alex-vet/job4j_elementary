package ru.job4j.exercises.arrays;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int row: data) {
            sum += row;
        }
        return sum % 2 == 0;
    }
}
