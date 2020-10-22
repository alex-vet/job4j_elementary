package ru.job4j.exercises.arrays;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        while (num > prizes.length) {
            num = num % 4 == 0 ? 4 : num % 4;
        }
        return prizes[num - 1];
    }
}
