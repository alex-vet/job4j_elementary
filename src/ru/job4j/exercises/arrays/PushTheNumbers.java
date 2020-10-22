package ru.job4j.exercises.arrays;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int temp = array[row][column];
        int tempCurrent, tempNext, index;
        array[row][column] = 0;
        index = row - 1;
        tempCurrent = temp;
        if (index >= 0) {
            while (index >= 0) {
                tempNext = array[index][column];
                array[index][column] = tempCurrent;
                tempCurrent = tempNext;
                index--;
            }
        }
        tempCurrent = temp;
        index = row + 1;
        if (index < array.length) {
            while (index < array.length) {
                tempNext = array[index][column];
                array[index][column] = tempCurrent;
                tempCurrent = tempNext;
                index++;
            }
        }
        tempCurrent = temp;
        index = column - 1;
        if (index >= 0) {
            while (index >= 0) {
                tempNext = array[row][index];
                array[row][index] = tempCurrent;
                tempCurrent = tempNext;
                index--;
            }
        }
        tempCurrent = temp;
        index = column + 1;
        if (index < array[row].length) {
            while (index < array[row].length) {
                tempNext = array[row][index];
                array[row][index] = tempCurrent;
                tempCurrent = tempNext;
                index++;
            }
        }
    }
}
