package ru.job4j.exercises.arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int cell = 0, value = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[cell + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = value++;
            }
            cell++;
        }
        return triangle;
    }
}
