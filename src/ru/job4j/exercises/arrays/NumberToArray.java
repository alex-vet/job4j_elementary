package ru.job4j.exercises.arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        int[] rsl = new int[sb.length()];
        for (int index = 0; index < sb.length(); index++) {
            rsl[index] = Integer.parseInt(String.valueOf(sb.charAt(index)));
        }
        return rsl;
    }
}
