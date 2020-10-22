package ru.job4j.exercises.arrays;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder(words[0]);
        for (int index = 1; index < words.length; index++) {
            result.append(" ").append(words[index]);
         }
        return result.toString();
}
}
