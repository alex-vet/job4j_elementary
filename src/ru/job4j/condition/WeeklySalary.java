package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] != 0) {
                rsl = rsl + (hours[i] > 8 ? i == 5 || i == 6 ? ((hours[i] - 8) * 30) + (8 * 20) : ((hours[i] - 8) * 15) + (8 * 10) : i == 5 || i == 6 ? hours[i] * 20 : hours[i] * 10);
            }
        }
        return rsl;
    }
}
