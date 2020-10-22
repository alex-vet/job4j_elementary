package ru.job4j.exercises.arrays;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int negative = 0;
        for (int el: data) {
            if (el < 0) {
                negative++;
            }
        }
        return negative % 2 != 0;
    }
}
