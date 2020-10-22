package ru.job4j.exercises.arrays;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        int sum;
        for (int index = 2; index < data.length; index++) {
            sum = data[index - 2] + data[index - 1];
            if (sum != data[index]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
