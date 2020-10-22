package ru.job4j.exercises.arrays;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            sum += nums[index] - nums[index + 1];
        }
        return sum;
    }
}
