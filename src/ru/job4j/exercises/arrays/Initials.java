package ru.job4j.exercises.arrays;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < fio.length; index++) {
            if (index > 0) {
                fio[index] = String.valueOf(fio[index].charAt(0));
            }
        }
        sb.append(fio[0]).append(' ').append(fio[1]).append('.').append(fio[2]).append('.');
        return sb.toString();
    }
}
