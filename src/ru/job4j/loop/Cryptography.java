package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        } else if (s.length() == 4) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 4; i++) {
            sb.setCharAt(i, '#');
        }
        return sb.toString();
    }
}
