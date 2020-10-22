package ru.job4j.exercises.arrays;

public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int el : ints) {
            if (num % el != 0) {
                return false;
            }
        }
        return true;
    }
}
