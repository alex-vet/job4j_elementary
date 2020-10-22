package ru.job4j.exercises.arrays;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sum1 = 0, sum2 = 0, winner = 0;
        for (int index = 0; index < players.length; index++) {
            if (index % 2 == 0) {
                sum1 += players[index];
            } else {
                sum2 += players[index];
            }
        }
        if (sum1 != sum2) {
            winner = sum1 > sum2 ? 1 : 2;
        }
        return winner;
    }
}
