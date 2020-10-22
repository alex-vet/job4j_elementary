package ru.job4j.exercises.arrays;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int index = 0; index < seq.length; index++) {
            if (index <= 4) {
                seq[index] = '0';
            } else if (index >= seq.length - 5) {
                seq[index] = '1';
            }
        }
        return seq;
    }
}
