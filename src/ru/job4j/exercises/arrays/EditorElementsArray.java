package ru.job4j.exercises.arrays;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = array[row][cell] > el ? array[row][cell] - el : 0;
            }
        }
        return array;
    }
}
