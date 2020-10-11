package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages =  new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices =  new float[40];
        System.out.println("Размер массива равен: " + prices.length);

        String[] names =  new String[4];
        names[0] = "Alexey Vetoshkin";
        names[1] = "Vladimir Suhoy";
        names[2] = "Igor Zakin";
        names[3] = "Petr Arsentev";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
