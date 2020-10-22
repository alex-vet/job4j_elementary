package ru.job4j.exercises.arrays;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int index = 0; index < string.length; index++) {
            result[index] = Character.isLowerCase(string[index]) ? Character.toUpperCase(string[index]) : string[index];
        }
        return result;
    }
}
