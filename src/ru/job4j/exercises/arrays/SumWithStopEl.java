package ru.job4j.exercises.arrays;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int result = 0;
        for (int datum : data) {
            if (datum == el) {
                break;
            } else {
                result += datum;
            }
        }
        return result % 2 == 0 ? result : 0;
    }
}
