package ru.job4j.exercises.arrays;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (int index = 1; index < data.length; index++) {
            if (data[index] - data[index - 1] != 1) {
                result = data[index];
                break;
            }
        }
        return result;
    }
}
