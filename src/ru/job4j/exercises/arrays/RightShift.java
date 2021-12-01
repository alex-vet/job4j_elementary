package ru.job4j.exercises.arrays;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int index = 0; index < count; index++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int tempNext, temp = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                temp = nums[index];
                nums[index] =  nums[nums.length - 1];
            } else
            if (index == nums.length - 1) {
                nums[index] = temp;
            } else {
                tempNext = nums[index];
                nums[index] = temp;
                temp = tempNext;
            }

        }
    }
}
