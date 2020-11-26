package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return one >= max(two, three) ? one : max(two, three);
    }

    public static int max(int one, int two, int three, int four) {
        return one >= max(two, three, four) ? one : max(two, three, four);
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
        result = Max.max(1, 2, 3);
        System.out.println(result);
        result = Max.max(1, 2, 3, 4);
        System.out.println(result);
    }
}
