package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        boolean equals = true;
        for (int index = 0; index < sb.length() / 2 + 1; index++) {
           if (sb.charAt(index) != sb.charAt(sb.length() - 1 - index)) {
               equals = false;
               break;
           }
        }
        return equals;
    }
}
