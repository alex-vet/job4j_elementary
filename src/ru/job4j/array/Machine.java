package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final static int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        while (change - COINS[size] >= 0) {
            change = change - COINS[size];
            rsl[size] = COINS[size];
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
