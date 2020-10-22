package ru.job4j.exercises.arrays;

import org.junit.Test;
import ru.job4j.exercises.arrays.UpperCase;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

}