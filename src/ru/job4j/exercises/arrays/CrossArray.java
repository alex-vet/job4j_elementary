package ru.job4j.exercises.arrays;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int ints : left) {
            for (int elem : right) {
                if (ints == elem) {
                    System.out.println(ints);
                }
            }
        }
    }
}
