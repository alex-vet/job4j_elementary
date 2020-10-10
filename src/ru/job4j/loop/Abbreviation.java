package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rsl = new StringBuilder(sb.substring(0, 1));
        int index = sb.indexOf(" ");
        while (index > 0) {
            rsl.append(sb.substring(index + 1, index + 2));
            sb.delete(index, index + 1);
            index = sb.indexOf(" ");
        }
        return rsl.toString();
    }
}
