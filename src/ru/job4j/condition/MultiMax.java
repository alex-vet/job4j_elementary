package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = first > third ? first : third;
        return second > rsl ? second : rsl;
    }
}
