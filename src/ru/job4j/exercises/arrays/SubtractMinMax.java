package ru.job4j.exercises.arrays;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = ints[0], max = ints[0];
        for (int el: ints) {
            if (el > max) {
                max = el;
            } else if (el < min) {
                min = el;
            }
        }
        return max - min;
    }
}
