package ru.job4j.exercises.arrays;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rst = -1, j = 0; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < string.length; index++) {
            if (string[index] == c) {
                j++;
                if (number == j) {
                    rst = index;
                    break;
                }
            }
        }
        return rst;
    }
}
