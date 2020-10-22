package ru.job4j.exercises.arrays;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] rsl = new int[ints.length];
        for (int index = 0; index < ints.length; index++) {
            rsl[index] = ints[index] % number;
        }
        return rsl;
    }
}
