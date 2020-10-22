package ru.job4j.exercises.arrays;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int length = 0, maxLength = 0, prevElem = 0;
        for (int elem : array) {
            if (prevElem <= elem) {
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
            prevElem = elem;
        }
        return Math.max(maxLength, length);
    }
}
